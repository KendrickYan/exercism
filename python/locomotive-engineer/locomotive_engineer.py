"""Functions which helps the locomotive engineer to keep track of the train."""


def get_list_of_wagons(*args) -> list[int]:
    """Return a list of wagons.

    :param: arbitrary number of wagons.
    :return: list - list of wagons.
    """
    return list(args)


def fix_list_of_wagons(each_wagons_id: list[int], missing_wagons: list[int]) -> list[int]:
    """Fix the list of wagons.

    :param each_wagons_id: list - the list of wagons.
    :param missing_wagons: list - the list of missing wagons.
    :return: list - list of wagons.
    """
    # so 1, missing_wagons, wagons after 1, wagons before 1

    index_of_1 = each_wagons_id.index(1)
    earlier_wagons = each_wagons_id[:index_of_1]
    _, *later_wagons = each_wagons_id[index_of_1:]
    return [1, *missing_wagons, *later_wagons, *earlier_wagons]

def add_missing_stops(route: dict, **kwargs) -> dict:
    """Add missing stops to route dict.

    :param route: dict - the dict of routing information.
    :param: arbitrary number of stops.
    :return: dict - updated route dictionary.
    """
    route['stops'] = list(kwargs.values())
    return route


def extend_route_information(route: dict[str, str], more_route_information: dict[str, str]) -> dict[str, str]:
    """Extend route information with more_route_information.

    :param route: dict - the route information.
    :param more_route_information: dict -  extra route information.
    :return: dict - extended route information.
    """
    return {**route, **more_route_information}


def fix_wagon_depot(wagons_rows: list[list[tuple[int, str]]]) -> list[list[tuple[int, str]]]:
    """Fix the list of rows of wagons.

    :param wagons_rows: list[list[tuple]] - the list of rows of wagons.
    :return: list[list[tuple]] - list of rows of wagons.
    """
    return [list(row) for row in zip(*wagons_rows)]
