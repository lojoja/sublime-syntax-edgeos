/* SYNTAX TEST "Packages/EdgeOS/EdgeOS.sublime-syntax" */

/* comment */
/* <- punctuation.definition.comment.begin.edgeos */
/*^^^^^^^^^^^ comment.block.edgeos */
/*         ^^ punctuation.definition.comment.end.edgeos */

firewall {
/* <- entity.name.section.edgeos */
/*       ^ meta.block.edgeos */
/*       ^ punctuation.section.block.begin.edgeos */

    /* comment */
/*  ^^ punctuation.definition.comment.begin.edgeos */
/*  ^^^^^^^^^^^^^ comment.block.edgeos */
/*             ^^ punctuation.definition.comment.end.edgeos */

    all-ping enable
/*  ^^^^^^^^ entity.name.tag.edgeos */
/*           ^^^^^^ keyword.other.edgeos */

    group {
        address-group my_address_group {
/*                    ^^^^^^^^^^^^^^^^ string.unquoted.edgeos */

            address 192.168.0.10
/*                  ^^^^^^^^^^^^ constant.numeric.integer.edgeos */

            address 10.2.0.0/24
/*                  ^^^^^^^^ constant.numeric.integer.edgeos */
/*                          ^ punctuation.separator.ip.mask.edgeos */
/*                           ^^ constant.numeric.integer.edgeos */

            description "address group description"
/*                      ^^^^^^^^^^^^^^^^^^^^^^^^^^^ string.quoted.double.edgeos */
/*                      ^ punctuation.definition.string.begin.edgeos */
/*                                                ^ punctuation.definition.string.end.edgeos */
        }
    }
}
/* <- punctuation.section.block.end.edgeos */

service {
    dhcp-server {
        disabled false
/*               ^^^^^ constant.language.boolean.edgeos */

        subnet 192.168.0.0/24 {
            lease 3600
/*                ^^^^ constant.numeric.integer.edgeos */

            static-mapping foobar {
                mac-address 00:26:4A:02:C1:2C
/*                          ^^^^^^^^^^^^^^^^^ constant.numeric.hex.edgeos */
            }
        }

        custom-property enable
/*      ^^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
    }
}
}
/* <- invalid.illegal.stray-bracket-end.edgeos */
