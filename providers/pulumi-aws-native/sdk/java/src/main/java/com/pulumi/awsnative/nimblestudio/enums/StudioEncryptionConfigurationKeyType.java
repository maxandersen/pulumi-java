// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * &lt;p&gt;The type of KMS key that is used to encrypt studio data.&lt;/p&gt;
     * 
     */
    @EnumType
    public enum StudioEncryptionConfigurationKeyType {
        AwsOwnedKey("AWS_OWNED_KEY"),
        CustomerManagedKey("CUSTOMER_MANAGED_KEY");

        private final String value;

        StudioEncryptionConfigurationKeyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StudioEncryptionConfigurationKeyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
