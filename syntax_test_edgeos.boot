/* SYNTAX TEST "Packages/EdgeOS/EdgeOS.sublime-syntax" */

/* comment */
/* <- punctuation.definition.comment.begin.edgeos */
/*^^^^^^^^^^^ comment.block.edgeos */
/*         ^^ punctuation.definition.comment.end.edgeos */

firewall {
/* <- entity.name.section.edgeos */
/*       ^ meta.block.edgeos punctuation.section.block.begin.edgeos */

    /* comment */
/*  ^^ punctuation.definition.comment.begin.edgeos */
/*  ^^^^^^^^^^^^^ comment.block.edgeos */
/*             ^^ punctuation.definition.comment.end.edgeos */

    group {
/*  ^^^^^ entity.name.tag.edgeos */
/*        ^ meta.block.edgeos punctuation.section.block.begin.edgeos */
    }
/*  ^ punctuation.section.block.end.edgeos */

    iface lo
/*  ^^^^^ entity.other.attribute-name.edgeos */
/*        ^^ keyword.other.interface.edgeos */

    iface bond0
/*  ^^^^^ entity.other.attribute-name.edgeos */
/*        ^^^^^ keyword.other.interface.edgeos */

    iface eth0
/*  ^^^^^ entity.other.attribute-name.edgeos */
/*        ^^^^ keyword.other.interface.edgeos */

    iface_negate !lo
/*  ^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*               ^ keyword.operator.edgeos */
/*                ^^ keyword.other.interface.edgeos */

    iface_negate !bond0
/*  ^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*               ^ keyword.operator.edgeos */
/*                ^^^^^ keyword.other.interface.edgeos */

    iface_negate !eth0
/*  ^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*               ^ keyword.operator.edgeos */
/*                ^^^^ keyword.other.interface.edgeos */

    iface_virtual bond0.1
/*  ^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                ^^^^^^^ keyword.other.interface.edgeos */

    iface_virtual eth0.1
/*  ^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                ^^^^^^ keyword.other.interface.edgeos */

    iface_wildcard bond+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^^ keyword.other.interface.edgeos */
/*                     ^ keyword.operator.edgeos */

    iface_wildcard bond0+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^^^ keyword.other.interface.edgeos */
/*                      ^ keyword.operator.edgeos */

    iface_wildcard bond0.+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^^^^ keyword.other.interface.edgeos */
/*                       ^ keyword.operator.edgeos */

    iface_wildcard eth+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^ keyword.other.interface.edgeos */
/*                    ^ keyword.operator.edgeos */

    iface_wildcard eth0+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^^ keyword.other.interface.edgeos */
/*                     ^ keyword.operator.edgeos */

    iface_wildcard eth0.+
/*  ^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                 ^^^^^ keyword.other.interface.edgeos */
/*                      ^ keyword.operator.edgeos */

    protocol tcp
/*  ^^^^^^^^ entity.name.tag.edgeos */
/*           ^^^ keyword.other.protocol.edgeos */

    service acr-nema
/*  ^^^^^^^ entity.name.tag.edgeos */
/*          ^^^^^^^^ keyword.other.service.edgeos */

    dpi File-Transfer
/*  ^^^ entity.name.tag.edgeos */
/*      ^^^^^^^^^^^^^ keyword.other.dpi.edgeos */

    generic 24v
/*  ^^^^^^^ entity.other.attribute-name.edgeos */
/*          ^^^ keyword.other.edgeos */

    boolean true
/*  ^^^^^^^ entity.other.attribute-name.edgeos */
/*          ^^^^ constant.language.boolean.edgeos */

    bit 1gbps
/*  ^^^ entity.name.tag.edgeos */
/*      ^ constant.numeric.integer.edgeos */
/*       ^^^^ keyword.other.bit.edgeos */

    geo 1098493.11234n
/*  ^^^ entity.other.attribute-name.edgeos */
/*      ^^^^^^^^^^^^^ constant.numeric.float.edgeos */
/*                   ^ keyword.other.geo.edgeos */

    timerate 100/second
/*  ^^^^^^^^ entity.other.attribute-name.edgeos */
/*           ^^^ constant.numeric.integer.edgeos */
/*              ^ punctuation.separator.timerate.edgeos */
/*               ^^^^^^ keyword.other.timerate.edgeos */

    ipv4 192.168.0.10
/*  ^^^^ entity.name.tag.edgeos */
/*       ^^^^^^^^^^^^ constant.numeric.integer.edgeos */

    ipv4_negate !192.168.0.10
/*  ^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*              ^ keyword.operator.edgeos */
/*               ^^^^^^^^^^^^ constant.numeric.integer.edgeos */

    ipv4_mask 192.168.0.0/24
/*  ^^^^^^^^^ entity.other.attribute-name.edgeos */
/*            ^^^^^^^^^^^ constant.numeric.integer.edgeos */
/*                       ^ punctuation.separator.ip.mask.edgeos */
/*                        ^^ constant.numeric.integer.edgeos */

    ipv6 2001:DB8:ABCD:12::
/*  ^^^^ entity.name.tag.edgeos */
/*       ^^^^^^^^^^^^^^^^^^ constant.numeric.integer.long.hex.edgeos */

    ipv6_negate !2001:DB8:ABCD:12::
/*  ^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*              ^ keyword.operator.edgeos */
/*               ^^^^^^^^^^^^^^^^^^ constant.numeric.integer.long.hex.edgeos */

    ipv6_embed_ipv4 ::ffff:192.168.0.10
/*  ^^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                  ^^^^^^^^^^^^^^^^^^^ constant.numeric.integer.long.hex.edgeos */

    ipv6_mask 2001:db8:abcd:0012::0/64
/*  ^^^^^^^^^ entity.other.attribute-name.edgeos */
/*            ^^^^^^^^^^^^^^^^^^^^^ constant.numeric.integer.long.hex.edgeos */
/*                                 ^ punctuation.separator.ip.mask.edgeos */
/*                                  ^^ constant.numeric.integer.edgeos */

    allowed_ips 0.0.0.0/0, 2001:DB8:ABCD:12::, !192.168.1.0/24
/*  ^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*              ^^^^^^^ constant.numeric.integer.edgeos */
/*                     ^ punctuation.separator.ip.mask.edgeos */
/*                      ^ constant.numeric.integer.edgeos */
/*                       ^ punctuation.separator.ip.list.edgeos */
/*                         ^^^^^^^^^^^^^^^^^^ constant.numeric.integer.long.hex.edgeos */
/*                                           ^ punctuation.separator.ip.list.edgeos */
/*                                             ^ keyword.operator.edgeos */
/*                                              ^^^^^^^^^^^ constant.numeric.integer.edgeos */
/*                                                         ^ punctuation.separator.ip.mask.edgeos */
/*                                                          ^^ constant.numeric.integer.edgeos */

    allowed_ips 0.0.0.0/0, !192.168.1.0/24, 192
/*  ^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*              ^^^^^^^ constant.numeric.integer.edgeos */
/*                     ^ punctuation.separator.ip.mask.edgeos */
/*                      ^ constant.numeric.integer.edgeos */
/*                       ^ punctuation.separator.ip.list.edgeos */
/*                         ^ keyword.operator.edgeos */
/*                          ^^^^^^^^^^^ constant.numeric.integer.edgeos */
/*                                     ^ punctuation.separator.ip.mask.edgeos */
/*                                      ^^ constant.numeric.integer.edgeos */
/*                                        ^ invalid.illegal.stray-comma-separator.edgeos */
/*                                          ^^^ invalid.illegal.ip.edgeos */

    mac 00:A1:B2:C3:D4:E5
/*  ^^^ entity.name.tag.edgeos */
/*      ^^^^^^^^^^^^^^^^^ constant.numeric.hex.edgeos */

    hex 0xAF,0xAF
/*  ^^^ entity.other.attribute-name.edgeos */
/*      ^^^^^^^^^ constant.numeric.hex.edgeos */

    float 100.0
/*  ^^^^^ entity.other.attribute-name.edgeos */
/*        ^^^^^ constant.numeric.float.edgeos */

    float_neg -100.0
/*  ^^^^^^^^^ entity.other.attribute-name.edgeos */
/*            ^ keyword.operator.edgeos */
/*             ^^^^^ constant.numeric.float.edgeos */

    float_perc 100.0%%
/*  ^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*              ^^^^ constant.numeric.float.edgeos */
/*                  ^^ keyword.operator.edgeos */

    int 100
/*  ^^^ entity.name.tag.edgeos */
/*      ^^^ constant.numeric.integer.edgeos */

    int_neg -100
/*  ^^^^^^^ entity.other.attribute-name.edgeos */
/*          ^ keyword.operator.edgeos */
/*           ^^^ constant.numeric.integer.edgeos */

    int_perc 100%%
/*  ^^^^^^^^ entity.other.attribute-name.edgeos */
/*           ^^^ constant.numeric.integer.edgeos */
/*              ^^ keyword.operator.edgeos */

    string_quoted "string quoted"
/*  ^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                ^ punctuation.definition.string.begin.edgeos */
/*                ^^^^^^^^^^^^^^^ string.quoted.double.edgeos */
/*                              ^ punctuation.definition.string.end.edgeos */

    string_quoted_neg !"string quoted"
/*  ^^^^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                    ^ keyword.operator.edgeos */
/*                     ^ punctuation.definition.string.begin.edgeos */
/*                     ^^^^^^^^^^^^^^^ string.quoted.double.edgeos */
/*                                   ^ punctuation.definition.string.end.edgeos */

    string_unquoted string_unquoted
/*  ^^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                  ^^^^^^^^^^^^^^^ string.unquoted.edgeos */

    string_unquoted_neg !string_unquoted
/*  ^^^^^^^^^^^^^^^^^^^ entity.other.attribute-name.edgeos */
/*                      ^ keyword.operator.edgeos */
/*                       ^^^^^^^^^^^^^^^ string.unquoted.edgeos */
}
/* <- punctuation.section.block.end.edgeos */

}
/* <- invalid.illegal.stray-bracket-end.edgeos */
