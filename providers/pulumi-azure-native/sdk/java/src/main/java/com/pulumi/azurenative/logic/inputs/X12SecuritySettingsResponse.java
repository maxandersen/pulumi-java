// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 agreement security settings.
 * 
 */
public final class X12SecuritySettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12SecuritySettingsResponse Empty = new X12SecuritySettingsResponse();

    /**
     * The authorization qualifier.
     * 
     */
    @Import(name="authorizationQualifier", required=true)
    private String authorizationQualifier;

    public String authorizationQualifier() {
        return this.authorizationQualifier;
    }

    /**
     * The authorization value.
     * 
     */
    @Import(name="authorizationValue")
    private @Nullable String authorizationValue;

    public Optional<String> authorizationValue() {
        return Optional.ofNullable(this.authorizationValue);
    }

    /**
     * The password value.
     * 
     */
    @Import(name="passwordValue")
    private @Nullable String passwordValue;

    public Optional<String> passwordValue() {
        return Optional.ofNullable(this.passwordValue);
    }

    /**
     * The security qualifier.
     * 
     */
    @Import(name="securityQualifier", required=true)
    private String securityQualifier;

    public String securityQualifier() {
        return this.securityQualifier;
    }

    private X12SecuritySettingsResponse() {}

    private X12SecuritySettingsResponse(X12SecuritySettingsResponse $) {
        this.authorizationQualifier = $.authorizationQualifier;
        this.authorizationValue = $.authorizationValue;
        this.passwordValue = $.passwordValue;
        this.securityQualifier = $.securityQualifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12SecuritySettingsResponse $;

        public Builder() {
            $ = new X12SecuritySettingsResponse();
        }

        public Builder(X12SecuritySettingsResponse defaults) {
            $ = new X12SecuritySettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder authorizationQualifier(String authorizationQualifier) {
            $.authorizationQualifier = authorizationQualifier;
            return this;
        }

        public Builder authorizationValue(@Nullable String authorizationValue) {
            $.authorizationValue = authorizationValue;
            return this;
        }

        public Builder passwordValue(@Nullable String passwordValue) {
            $.passwordValue = passwordValue;
            return this;
        }

        public Builder securityQualifier(String securityQualifier) {
            $.securityQualifier = securityQualifier;
            return this;
        }

        public X12SecuritySettingsResponse build() {
            $.authorizationQualifier = Objects.requireNonNull($.authorizationQualifier, "expected parameter 'authorizationQualifier' to be non-null");
            $.securityQualifier = Objects.requireNonNull($.securityQualifier, "expected parameter 'securityQualifier' to be non-null");
            return $;
        }
    }

}
