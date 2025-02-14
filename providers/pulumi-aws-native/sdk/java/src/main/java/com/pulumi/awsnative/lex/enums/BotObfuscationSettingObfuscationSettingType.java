// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
     * 
     */
    @EnumType
    public enum BotObfuscationSettingObfuscationSettingType {
        None("None"),
        DefaultObfuscation("DefaultObfuscation");

        private final String value;

        BotObfuscationSettingObfuscationSettingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BotObfuscationSettingObfuscationSettingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
