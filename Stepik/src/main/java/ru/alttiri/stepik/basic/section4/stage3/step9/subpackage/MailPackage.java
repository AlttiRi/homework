package ru.alttiri.stepik.basic.section4.stage3.step9.subpackage;

/**
 * Посылка, содержимое которой можно получить с помощью метода `getContent`
 */
public class MailPackage extends AbstractSendable {
    private final ru.alttiri.stepik.basic.section4.stage3.step9.subpackage.Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}
