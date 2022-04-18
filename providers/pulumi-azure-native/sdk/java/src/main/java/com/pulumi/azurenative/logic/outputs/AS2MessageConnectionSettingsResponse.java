// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class AS2MessageConnectionSettingsResponse {
    /**
     * The value indicating whether to ignore mismatch in certificate name.
     * 
     */
    private final Boolean ignoreCertificateNameMismatch;
    /**
     * The value indicating whether to keep the connection alive.
     * 
     */
    private final Boolean keepHttpConnectionAlive;
    /**
     * The value indicating whether to support HTTP status code 'CONTINUE'.
     * 
     */
    private final Boolean supportHttpStatusCodeContinue;
    /**
     * The value indicating whether to unfold the HTTP headers.
     * 
     */
    private final Boolean unfoldHttpHeaders;

    @CustomType.Constructor
    private AS2MessageConnectionSettingsResponse(
        @CustomType.Parameter("ignoreCertificateNameMismatch") Boolean ignoreCertificateNameMismatch,
        @CustomType.Parameter("keepHttpConnectionAlive") Boolean keepHttpConnectionAlive,
        @CustomType.Parameter("supportHttpStatusCodeContinue") Boolean supportHttpStatusCodeContinue,
        @CustomType.Parameter("unfoldHttpHeaders") Boolean unfoldHttpHeaders) {
        this.ignoreCertificateNameMismatch = ignoreCertificateNameMismatch;
        this.keepHttpConnectionAlive = keepHttpConnectionAlive;
        this.supportHttpStatusCodeContinue = supportHttpStatusCodeContinue;
        this.unfoldHttpHeaders = unfoldHttpHeaders;
    }

    /**
     * The value indicating whether to ignore mismatch in certificate name.
     * 
    */
    public Boolean ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }
    /**
     * The value indicating whether to keep the connection alive.
     * 
    */
    public Boolean keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }
    /**
     * The value indicating whether to support HTTP status code 'CONTINUE'.
     * 
    */
    public Boolean supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }
    /**
     * The value indicating whether to unfold the HTTP headers.
     * 
    */
    public Boolean unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2MessageConnectionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreCertificateNameMismatch;
        private Boolean keepHttpConnectionAlive;
        private Boolean supportHttpStatusCodeContinue;
        private Boolean unfoldHttpHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2MessageConnectionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCertificateNameMismatch = defaults.ignoreCertificateNameMismatch;
    	      this.keepHttpConnectionAlive = defaults.keepHttpConnectionAlive;
    	      this.supportHttpStatusCodeContinue = defaults.supportHttpStatusCodeContinue;
    	      this.unfoldHttpHeaders = defaults.unfoldHttpHeaders;
        }

        public Builder ignoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch);
            return this;
        }
        public Builder keepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive);
            return this;
        }
        public Builder supportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue);
            return this;
        }
        public Builder unfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders);
            return this;
        }        public AS2MessageConnectionSettingsResponse build() {
            return new AS2MessageConnectionSettingsResponse(ignoreCertificateNameMismatch, keepHttpConnectionAlive, supportHttpStatusCodeContinue, unfoldHttpHeaders);
        }
    }
}
