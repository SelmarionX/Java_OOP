from HW7.model.products.Product import Product


class Drinkables(Product):
    def __init__(self, name, price, volume):
        super().__init__(name, price)
        self._volume = volume

    @property
    def volume(self):
        return self._volume

    @volume.setter
    def volume(self, new_volume):
        self._volume = new_volume

    def __str__(self) -> str:
        return f"{super().__str__()} руб., объем: {self.volume} литра"