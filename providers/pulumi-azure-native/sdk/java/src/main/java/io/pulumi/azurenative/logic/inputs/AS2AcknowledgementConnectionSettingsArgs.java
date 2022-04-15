// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement acknowledgement connection settings.
 * 
 */
public final class AS2AcknowledgementConnectionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2AcknowledgementConnectionSettingsArgs Empty = new AS2AcknowledgementConnectionSettingsArgs();

    /**
     * Indicates whether to ignore mismatch in certificate name.
     * 
     */
    @Import(name="ignoreCertificateNameMismatch", required=true)
      private final Output<Boolean> ignoreCertificateNameMismatch;

    public Output<Boolean> ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * Indicates whether to keep the connection alive.
     * 
     */
    @Import(name="keepHttpConnectionAlive", required=true)
      private final Output<Boolean> keepHttpConnectionAlive;

    public Output<Boolean> keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * Indicates whether to support HTTP status code 'CONTINUE'.
     * 
     */
    @Import(name="supportHttpStatusCodeContinue", required=true)
      private final Output<Boolean> supportHttpStatusCodeContinue;

    public Output<Boolean> supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * Indicates whether to unfold the HTTP headers.
     * 
     */
    @Import(name="unfoldHttpHeaders", required=true)
      private final Output<Boolean> unfoldHttpHeaders;

    public Output<Boolean> unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    public AS2AcknowledgementConnectionSettingsArgs(
        Output<Boolean> ignoreCertificateNameMismatch,
        Output<Boolean> keepHttpConnectionAlive,
        Output<Boolean> supportHttpStatusCodeContinue,
        Output<Boolean> unfoldHttpHeaders) {
        this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch, "expected parameter 'ignoreCertificateNameMismatch' to be non-null");
        this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive, "expected parameter 'keepHttpConnectionAlive' to be non-null");
        this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue, "expected parameter 'supportHttpStatusCodeContinue' to be non-null");
        this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders, "expected parameter 'unfoldHttpHeaders' to be non-null");
    }

    private AS2AcknowledgementConnectionSettingsArgs() {
        this.ignoreCertificateNameMismatch = Codegen.empty();
        this.keepHttpConnectionAlive = Codegen.empty();
        this.supportHttpStatusCodeContinue = Codegen.empty();
        this.unfoldHttpHeaders = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2AcknowledgementConnectionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> ignoreCertificateNameMismatch;
        private Output<Boolean> keepHttpConnectionAlive;
        private Output<Boolean> supportHttpStatusCodeContinue;
        private Output<Boolean> unfoldHttpHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2AcknowledgementConnectionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCertificateNameMismatch = defaults.ignoreCertificateNameMismatch;
    	      this.keepHttpConnectionAlive = defaults.keepHttpConnectionAlive;
    	      this.supportHttpStatusCodeContinue = defaults.supportHttpStatusCodeContinue;
    	      this.unfoldHttpHeaders = defaults.unfoldHttpHeaders;
        }

        public Builder ignoreCertificateNameMismatch(Output<Boolean> ignoreCertificateNameMismatch) {
            this.ignoreCertificateNameMismatch = Objects.requireNonNull(ignoreCertificateNameMismatch);
            return this;
        }
        public Builder ignoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            this.ignoreCertificateNameMismatch = Output.of(Objects.requireNonNull(ignoreCertificateNameMismatch));
            return this;
        }
        public Builder keepHttpConnectionAlive(Output<Boolean> keepHttpConnectionAlive) {
            this.keepHttpConnectionAlive = Objects.requireNonNull(keepHttpConnectionAlive);
            return this;
        }
        public Builder keepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            this.keepHttpConnectionAlive = Output.of(Objects.requireNonNull(keepHttpConnectionAlive));
            return this;
        }
        public Builder supportHttpStatusCodeContinue(Output<Boolean> supportHttpStatusCodeContinue) {
            this.supportHttpStatusCodeContinue = Objects.requireNonNull(supportHttpStatusCodeContinue);
            return this;
        }
        public Builder supportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            this.supportHttpStatusCodeContinue = Output.of(Objects.requireNonNull(supportHttpStatusCodeContinue));
            return this;
        }
        public Builder unfoldHttpHeaders(Output<Boolean> unfoldHttpHeaders) {
            this.unfoldHttpHeaders = Objects.requireNonNull(unfoldHttpHeaders);
            return this;
        }
        public Builder unfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            this.unfoldHttpHeaders = Output.of(Objects.requireNonNull(unfoldHttpHeaders));
            return this;
        }        public AS2AcknowledgementConnectionSettingsArgs build() {
            return new AS2AcknowledgementConnectionSettingsArgs(ignoreCertificateNameMismatch, keepHttpConnectionAlive, supportHttpStatusCodeContinue, unfoldHttpHeaders);
        }
    }
}
