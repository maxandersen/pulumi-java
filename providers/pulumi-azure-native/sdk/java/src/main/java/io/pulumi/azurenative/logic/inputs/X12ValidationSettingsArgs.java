// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 agreement validation settings.
 * 
 */
public final class X12ValidationSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12ValidationSettingsArgs Empty = new X12ValidationSettingsArgs();

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
     * The value indicating whether to check for duplicate group control number.
     * 
     */
    @Import(name="checkDuplicateGroupControlNumber", required=true)
      private final Output<Boolean> checkDuplicateGroupControlNumber;

    public Output<Boolean> checkDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
     */
    @Import(name="checkDuplicateInterchangeControlNumber", required=true)
      private final Output<Boolean> checkDuplicateInterchangeControlNumber;

    public Output<Boolean> checkDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
     */
    @Import(name="checkDuplicateTransactionSetControlNumber", required=true)
      private final Output<Boolean> checkDuplicateTransactionSetControlNumber;

    public Output<Boolean> checkDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }

    /**
     * The validity period of interchange control number.
     * 
     */
    @Import(name="interchangeControlNumberValidityDays", required=true)
      private final Output<Integer> interchangeControlNumberValidityDays;

    public Output<Integer> interchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
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
     * The value indicating whether to validate character set in the message.
     * 
     */
    @Import(name="validateCharacterSet", required=true)
      private final Output<Boolean> validateCharacterSet;

    public Output<Boolean> validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
     */
    @Import(name="validateEDITypes", required=true)
      private final Output<Boolean> validateEDITypes;

    public Output<Boolean> validateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
     */
    @Import(name="validateXSDTypes", required=true)
      private final Output<Boolean> validateXSDTypes;

    public Output<Boolean> validateXSDTypes() {
        return this.validateXSDTypes;
    }

    public X12ValidationSettingsArgs(
        Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes,
        Output<Boolean> checkDuplicateGroupControlNumber,
        Output<Boolean> checkDuplicateInterchangeControlNumber,
        Output<Boolean> checkDuplicateTransactionSetControlNumber,
        Output<Integer> interchangeControlNumberValidityDays,
        Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy,
        Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes,
        Output<Boolean> validateCharacterSet,
        Output<Boolean> validateEDITypes,
        Output<Boolean> validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber, "expected parameter 'checkDuplicateGroupControlNumber' to be non-null");
        this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber, "expected parameter 'checkDuplicateInterchangeControlNumber' to be non-null");
        this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber, "expected parameter 'checkDuplicateTransactionSetControlNumber' to be non-null");
        this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays, "expected parameter 'interchangeControlNumberValidityDays' to be non-null");
        this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
        this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet, "expected parameter 'validateCharacterSet' to be non-null");
        this.validateEDITypes = Objects.requireNonNull(validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
        this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
    }

    private X12ValidationSettingsArgs() {
        this.allowLeadingAndTrailingSpacesAndZeroes = Codegen.empty();
        this.checkDuplicateGroupControlNumber = Codegen.empty();
        this.checkDuplicateInterchangeControlNumber = Codegen.empty();
        this.checkDuplicateTransactionSetControlNumber = Codegen.empty();
        this.interchangeControlNumberValidityDays = Codegen.empty();
        this.trailingSeparatorPolicy = Codegen.empty();
        this.trimLeadingAndTrailingSpacesAndZeroes = Codegen.empty();
        this.validateCharacterSet = Codegen.empty();
        this.validateEDITypes = Codegen.empty();
        this.validateXSDTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ValidationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes;
        private Output<Boolean> checkDuplicateGroupControlNumber;
        private Output<Boolean> checkDuplicateInterchangeControlNumber;
        private Output<Boolean> checkDuplicateTransactionSetControlNumber;
        private Output<Integer> interchangeControlNumberValidityDays;
        private Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;
        private Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes;
        private Output<Boolean> validateCharacterSet;
        private Output<Boolean> validateEDITypes;
        private Output<Boolean> validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ValidationSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.checkDuplicateGroupControlNumber = defaults.checkDuplicateGroupControlNumber;
    	      this.checkDuplicateInterchangeControlNumber = defaults.checkDuplicateInterchangeControlNumber;
    	      this.checkDuplicateTransactionSetControlNumber = defaults.checkDuplicateTransactionSetControlNumber;
    	      this.interchangeControlNumberValidityDays = defaults.interchangeControlNumberValidityDays;
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
        public Builder checkDuplicateGroupControlNumber(Output<Boolean> checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber);
            return this;
        }
        public Builder checkDuplicateGroupControlNumber(Boolean checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Output.of(Objects.requireNonNull(checkDuplicateGroupControlNumber));
            return this;
        }
        public Builder checkDuplicateInterchangeControlNumber(Output<Boolean> checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber);
            return this;
        }
        public Builder checkDuplicateInterchangeControlNumber(Boolean checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Output.of(Objects.requireNonNull(checkDuplicateInterchangeControlNumber));
            return this;
        }
        public Builder checkDuplicateTransactionSetControlNumber(Output<Boolean> checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber);
            return this;
        }
        public Builder checkDuplicateTransactionSetControlNumber(Boolean checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Output.of(Objects.requireNonNull(checkDuplicateTransactionSetControlNumber));
            return this;
        }
        public Builder interchangeControlNumberValidityDays(Output<Integer> interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays);
            return this;
        }
        public Builder interchangeControlNumberValidityDays(Integer interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Output.of(Objects.requireNonNull(interchangeControlNumberValidityDays));
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
        }        public X12ValidationSettingsArgs build() {
            return new X12ValidationSettingsArgs(allowLeadingAndTrailingSpacesAndZeroes, checkDuplicateGroupControlNumber, checkDuplicateInterchangeControlNumber, checkDuplicateTransactionSetControlNumber, interchangeControlNumberValidityDays, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
