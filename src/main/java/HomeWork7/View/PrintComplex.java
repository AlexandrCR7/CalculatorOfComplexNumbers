package HomeWork7.View;

public interface PrintComplex {
    /**
     * @apiNote Пришлось разделить один интерфейс на 3, для того,
     * чтобы соответствовать принципу - Разделение интерфейсов.
     * Сейчас в папке Вью, один интерфейс отвечает за старт,
     * второй за принт рациональных чисел, третий за принт комплексных.
     * @param result
     */
    void printResult(String result);
}
