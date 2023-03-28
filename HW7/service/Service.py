from HW7.model.vending_machine.VendingMachine import VendingMachine
from HW7.model.products.BottleOfWater import BottleOfWater
from HW7.model.products.HotDrinks import HotDrinks
from HW7.UI.UIConsole import UIConsole


class Service:

    def start(self):
        console = UIConsole()
        list_hot_drinks = [HotDrinks('Кофе', 100, 0.5, 90),
                           HotDrinks('Чай', 30, 0.5, 95),
                           HotDrinks('Горячий шоколад', 120, 0.7, 93)]
        list_bottle_of_water = [BottleOfWater('Кола', 100, 0.5),
                                BottleOfWater('Колокольчик', 80, 0.5),
                                BottleOfWater('Минералка', 20, 0.4)]
        vending_machine1 = VendingMachine()
        vending_machine2 = VendingMachine()
        console.print_message('-----Лист горячих напитков добавлен в торговый автомат-----')
        vending_machine1.list_products = list_hot_drinks
        console.print_list_product(vending_machine1.list_products)
        console.print_message('-----Лист бутилированных напитков добавлен в торговый автомат-----')
        vending_machine2.list_products = list_bottle_of_water
        console.print_list_product(vending_machine2.list_products)
        console.print_message('-----В горячие напитки добавлен кипяток-----')
        vending_machine1.add_at_list(HotDrinks('Кипяток', 10, 1.0, 99))
        console.print_list_product(vending_machine1.list_products)
        console.print_message('-----В бутилированные напитки добавлена Фанта-----')
        vending_machine2.add_at_list(BottleOfWater('Фанта', 120, 0.7))
        console.print_list_product(vending_machine2.list_products)
        console.print_message('-----Выдача Чай из торгового автомата-----')
        console.print_message(vending_machine1.get_product('Чай'))
        console.print_message('-----Выдача Минеральной воды из торгового автомата-----')
        console.print_message(vending_machine2.get_product('Минералка'))
