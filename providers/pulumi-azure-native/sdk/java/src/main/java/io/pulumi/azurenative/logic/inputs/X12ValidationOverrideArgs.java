// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 validation override settings.
 * 
 */
public final class X12ValidationOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12ValidationOverrideArgs Empty = new X12ValidationOverrideArgs();

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="allowLeadingAndTrailingSpacesAndZeroes", required=true)
      private final Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes;

    public Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The message id on which the validation settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
      private final Output<String> messageId;

    public Output<String> messageId() {
        return this.messageId;
    }

    /**
     * The trailing separator policy.
     * 
     */
    @Import(name="trailingSeparatorPolicy", required=true)
      private final Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;

    public Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="trimLeadingAndTrailingSpacesAndZeroes", required=true)
      private final Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes;

    public Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate character Set.
     * 
     */
    @Import(name="validateCharacterSet", required=true)
      private final Output<Boolean> validateCharacterSet;

    public Output<Boolean> validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * The value indicating whether to validate EDI types.
     * 
     */
    @Import(name="validateEDITypes", required=true)
      private final Output<Boolean> validateEDITypes;

    public Output<Boolean> validateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to validate XSD types.
     * 
     */
    @Import(name="validateXSDTypes", required=true)
      private final Output<Boolean> validateXSDTypes;

    public Output<Boolean> validateXSDTypes() {
        return this.validateXSDTypes;
    }

    public X12ValidationOverrideArgs(
        Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes,
        Output<String> messageId,
        Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy,
        Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes,
        Output<Boolean> validateCharacterSet,
        Output<Boolean> validateEDITypes,
        Output<Boolean> validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
        this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet, "expected parameter 'validateCharacterSet' to be non-null");
        this.validateEDITypes = Objects.requireNonNull(validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
        this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
    }

    private X12ValidationOverrideArgs() {
        this.allowLeadingAndTrailingSpacesAndZeroes = Codegen.empty();
        this.messageId = Codegen.empty();
        this.trailingSeparatorPolicy = Codegen.empty();
        this.trimLeadingAndTrailingSpacesAndZeroes = Codegen.empty();
        this.validateCharacterSet = Codegen.empty();
        this.validateEDITypes = Codegen.empty();
        this.validateXSDTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ValidationOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes;
        private Output<String> messageId;
        private Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;
        private Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes;
        private Output<Boolean> validateCharacterSet;
        private Output<Boolean> validateEDITypes;
        private Output<Boolean> validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ValidationOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.messageId = defaults.messageId;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder allowLeadingAndTrailingSpacesAndZeroes(Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }
        public Builder allowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Output.of(Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes));
            return this;
        }
        public Builder messageId(Output<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public Builder messageId(String messageId) {
            this.messageId = Output.of(Objects.requireNonNull(messageId));
            return this;
        }
        public Builder trailingSeparatorPolicy(Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }
        public Builder trailingSeparatorPolicy(Either<String,TrailingSeparatorPolicy> trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Output.of(Objects.requireNonNull(trailingSeparatorPolicy));
            return this;
        }
        public Builder trimLeadingAndTrailingSpacesAndZeroes(Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }
        public Builder trimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Output.of(Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes));
            return this;
        }
        public Builder validateCharacterSet(Output<Boolean> validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }
        public Builder validateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Output.of(Objects.requireNonNull(validateCharacterSet));
            return this;
        }
        public Builder validateEDITypes(Output<Boolean> validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }
        public Builder validateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Output.of(Objects.requireNonNull(validateEDITypes));
            return this;
        }
        public Builder validateXSDTypes(Output<Boolean> validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }
        public Builder validateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Output.of(Objects.requireNonNull(validateXSDTypes));
            return this;
        }        public X12ValidationOverrideArgs build() {
            return new X12ValidationOverrideArgs(allowLeadingAndTrailingSpacesAndZeroes, messageId, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
