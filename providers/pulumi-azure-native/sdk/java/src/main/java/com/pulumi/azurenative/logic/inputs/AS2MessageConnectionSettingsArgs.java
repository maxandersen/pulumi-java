// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement message connection settings.
 * 
 */
public final class AS2MessageConnectionSettingsArgs extends ResourceArgs {

    public static final AS2MessageConnectionSettingsArgs Empty = new AS2MessageConnectionSettingsArgs();

    /**
     * The value indicating whether to ignore mismatch in certificate name.
     * 
     */
    @Import(name="ignoreCertificateNameMismatch", required=true)
    private Output<Boolean> ignoreCertificateNameMismatch;

    /**
     * @return The value indicating whether to ignore mismatch in certificate name.
     * 
     */
    public Output<Boolean> ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * The value indicating whether to keep the connection alive.
     * 
     */
    @Import(name="keepHttpConnectionAlive", required=true)
    private Output<Boolean> keepHttpConnectionAlive;

    /**
     * @return The value indicating whether to keep the connection alive.
     * 
     */
    public Output<Boolean> keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
     * 
     */
    @Import(name="supportHttpStatusCodeContinue", required=true)
    private Output<Boolean> supportHttpStatusCodeContinue;

    /**
     * @return The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
     * 
     */
    public Output<Boolean> supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * The value indicating whether to unfold the HTTP headers.
     * 
     */
    @Import(name="unfoldHttpHeaders", required=true)
    private Output<Boolean> unfoldHttpHeaders;

    /**
     * @return The value indicating whether to unfold the HTTP headers.
     * 
     */
    public Output<Boolean> unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    private AS2MessageConnectionSettingsArgs() {}

    private AS2MessageConnectionSettingsArgs(AS2MessageConnectionSettingsArgs $) {
        this.ignoreCertificateNameMismatch = $.ignoreCertificateNameMismatch;
        this.keepHttpConnectionAlive = $.keepHttpConnectionAlive;
        this.supportHttpStatusCodeContinue = $.supportHttpStatusCodeContinue;
        this.unfoldHttpHeaders = $.unfoldHttpHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2MessageConnectionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2MessageConnectionSettingsArgs $;

        public Builder() {
            $ = new AS2MessageConnectionSettingsArgs();
        }

        public Builder(AS2MessageConnectionSettingsArgs defaults) {
            $ = new AS2MessageConnectionSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreCertificateNameMismatch The value indicating whether to ignore mismatch in certificate name.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCertificateNameMismatch(Output<Boolean> ignoreCertificateNameMismatch) {
            $.ignoreCertificateNameMismatch = ignoreCertificateNameMismatch;
            return this;
        }

        /**
         * @param ignoreCertificateNameMismatch The value indicating whether to ignore mismatch in certificate name.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            return ignoreCertificateNameMismatch(Output.of(ignoreCertificateNameMismatch));
        }

        /**
         * @param keepHttpConnectionAlive The value indicating whether to keep the connection alive.
         * 
         * @return builder
         * 
         */
        public Builder keepHttpConnectionAlive(Output<Boolean> keepHttpConnectionAlive) {
            $.keepHttpConnectionAlive = keepHttpConnectionAlive;
            return this;
        }

        /**
         * @param keepHttpConnectionAlive The value indicating whether to keep the connection alive.
         * 
         * @return builder
         * 
         */
        public Builder keepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            return keepHttpConnectionAlive(Output.of(keepHttpConnectionAlive));
        }

        /**
         * @param supportHttpStatusCodeContinue The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
         * 
         * @return builder
         * 
         */
        public Builder supportHttpStatusCodeContinue(Output<Boolean> supportHttpStatusCodeContinue) {
            $.supportHttpStatusCodeContinue = supportHttpStatusCodeContinue;
            return this;
        }

        /**
         * @param supportHttpStatusCodeContinue The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
         * 
         * @return builder
         * 
         */
        public Builder supportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            return supportHttpStatusCodeContinue(Output.of(supportHttpStatusCodeContinue));
        }

        /**
         * @param unfoldHttpHeaders The value indicating whether to unfold the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder unfoldHttpHeaders(Output<Boolean> unfoldHttpHeaders) {
            $.unfoldHttpHeaders = unfoldHttpHeaders;
            return this;
        }

        /**
         * @param unfoldHttpHeaders The value indicating whether to unfold the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder unfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            return unfoldHttpHeaders(Output.of(unfoldHttpHeaders));
        }

        public AS2MessageConnectionSettingsArgs build() {
            $.ignoreCertificateNameMismatch = Objects.requireNonNull($.ignoreCertificateNameMismatch, "expected parameter 'ignoreCertificateNameMismatch' to be non-null");
            $.keepHttpConnectionAlive = Objects.requireNonNull($.keepHttpConnectionAlive, "expected parameter 'keepHttpConnectionAlive' to be non-null");
            $.supportHttpStatusCodeContinue = Objects.requireNonNull($.supportHttpStatusCodeContinue, "expected parameter 'supportHttpStatusCodeContinue' to be non-null");
            $.unfoldHttpHeaders = Objects.requireNonNull($.unfoldHttpHeaders, "expected parameter 'unfoldHttpHeaders' to be non-null");
            return $;
        }
    }

}
