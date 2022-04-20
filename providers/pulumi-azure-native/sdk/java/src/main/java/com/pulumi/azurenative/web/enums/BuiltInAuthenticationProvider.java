// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    @EnumType
    public enum BuiltInAuthenticationProvider {
        AzureActiveDirectory("AzureActiveDirectory"),
        Facebook("Facebook"),
        Google("Google"),
        MicrosoftAccount("MicrosoftAccount"),
        Twitter("Twitter"),
        Github("Github");

        private final String value;

        BuiltInAuthenticationProvider(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BuiltInAuthenticationProvider[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
