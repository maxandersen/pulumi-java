// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The server key type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
     * 
     */
    @EnumType
    public enum ServerKeyType {
        ServiceManaged("ServiceManaged"),
        AzureKeyVault("AzureKeyVault");

        private final String value;

        ServerKeyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServerKeyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
