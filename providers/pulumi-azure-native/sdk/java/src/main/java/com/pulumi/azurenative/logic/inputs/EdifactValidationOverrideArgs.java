// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact validation override settings.
 * 
 */
public final class EdifactValidationOverrideArgs extends ResourceArgs {

    public static final EdifactValidationOverrideArgs Empty = new EdifactValidationOverrideArgs();

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="allowLeadingAndTrailingSpacesAndZeroes", required=true)
    private Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes;

    /**
     * @return The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    public Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate character Set.
     * 
     */
    @Import(name="enforceCharacterSet", required=true)
    private Output<Boolean> enforceCharacterSet;

    /**
     * @return The value indicating whether to validate character Set.
     * 
     */
    public Output<Boolean> enforceCharacterSet() {
        return this.enforceCharacterSet;
    }

    /**
     * The message id on which the validation settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
    private Output<String> messageId;

    /**
     * @return The message id on which the validation settings has to be applied.
     * 
     */
    public Output<String> messageId() {
        return this.messageId;
    }

    /**
     * The trailing separator policy.
     * 
     */
    @Import(name="trailingSeparatorPolicy", required=true)
    private Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;

    /**
     * @return The trailing separator policy.
     * 
     */
    public Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="trimLeadingAndTrailingSpacesAndZeroes", required=true)
    private Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes;

    /**
     * @return The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    public Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate EDI types.
     * 
     */
    @Import(name="validateEDITypes", required=true)
    private Output<Boolean> validateEDITypes;

    /**
     * @return The value indicating whether to validate EDI types.
     * 
     */
    public Output<Boolean> validateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to validate XSD types.
     * 
     */
    @Import(name="validateXSDTypes", required=true)
    private Output<Boolean> validateXSDTypes;

    /**
     * @return The value indicating whether to validate XSD types.
     * 
     */
    public Output<Boolean> validateXSDTypes() {
        return this.validateXSDTypes;
    }

    private EdifactValidationOverrideArgs() {}

    private EdifactValidationOverrideArgs(EdifactValidationOverrideArgs $) {
        this.allowLeadingAndTrailingSpacesAndZeroes = $.allowLeadingAndTrailingSpacesAndZeroes;
        this.enforceCharacterSet = $.enforceCharacterSet;
        this.messageId = $.messageId;
        this.trailingSeparatorPolicy = $.trailingSeparatorPolicy;
        this.trimLeadingAndTrailingSpacesAndZeroes = $.trimLeadingAndTrailingSpacesAndZeroes;
        this.validateEDITypes = $.validateEDITypes;
        this.validateXSDTypes = $.validateXSDTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactValidationOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactValidationOverrideArgs $;

        public Builder() {
            $ = new EdifactValidationOverrideArgs();
        }

        public Builder(EdifactValidationOverrideArgs defaults) {
            $ = new EdifactValidationOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLeadingAndTrailingSpacesAndZeroes The value indicating whether to allow leading and trailing spaces and zeroes.
         * 
         * @return builder
         * 
         */
        public Builder allowLeadingAndTrailingSpacesAndZeroes(Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes) {
            $.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
            return this;
        }

        /**
         * @param allowLeadingAndTrailingSpacesAndZeroes The value indicating whether to allow leading and trailing spaces and zeroes.
         * 
         * @return builder
         * 
         */
        public Builder allowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            return allowLeadingAndTrailingSpacesAndZeroes(Output.of(allowLeadingAndTrailingSpacesAndZeroes));
        }

        /**
         * @param enforceCharacterSet The value indicating whether to validate character Set.
         * 
         * @return builder
         * 
         */
        public Builder enforceCharacterSet(Output<Boolean> enforceCharacterSet) {
            $.enforceCharacterSet = enforceCharacterSet;
            return this;
        }

        /**
         * @param enforceCharacterSet The value indicating whether to validate character Set.
         * 
         * @return builder
         * 
         */
        public Builder enforceCharacterSet(Boolean enforceCharacterSet) {
            return enforceCharacterSet(Output.of(enforceCharacterSet));
        }

        /**
         * @param messageId The message id on which the validation settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder messageId(Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param messageId The message id on which the validation settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        /**
         * @param trailingSeparatorPolicy The trailing separator policy.
         * 
         * @return builder
         * 
         */
        public Builder trailingSeparatorPolicy(Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy) {
            $.trailingSeparatorPolicy = trailingSeparatorPolicy;
            return this;
        }

        /**
         * @param trailingSeparatorPolicy The trailing separator policy.
         * 
         * @return builder
         * 
         */
        public Builder trailingSeparatorPolicy(Either<String,TrailingSeparatorPolicy> trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Output.of(trailingSeparatorPolicy));
        }

        /**
         * @param trailingSeparatorPolicy The trailing separator policy.
         * 
         * @return builder
         * 
         */
        public Builder trailingSeparatorPolicy(String trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Either.ofLeft(trailingSeparatorPolicy));
        }

        /**
         * @param trailingSeparatorPolicy The trailing separator policy.
         * 
         * @return builder
         * 
         */
        public Builder trailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Either.ofRight(trailingSeparatorPolicy));
        }

        /**
         * @param trimLeadingAndTrailingSpacesAndZeroes The value indicating whether to trim leading and trailing spaces and zeroes.
         * 
         * @return builder
         * 
         */
        public Builder trimLeadingAndTrailingSpacesAndZeroes(Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes) {
            $.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
            return this;
        }

        /**
         * @param trimLeadingAndTrailingSpacesAndZeroes The value indicating whether to trim leading and trailing spaces and zeroes.
         * 
         * @return builder
         * 
         */
        public Builder trimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            return trimLeadingAndTrailingSpacesAndZeroes(Output.of(trimLeadingAndTrailingSpacesAndZeroes));
        }

        /**
         * @param validateEDITypes The value indicating whether to validate EDI types.
         * 
         * @return builder
         * 
         */
        public Builder validateEDITypes(Output<Boolean> validateEDITypes) {
            $.validateEDITypes = validateEDITypes;
            return this;
        }

        /**
         * @param validateEDITypes The value indicating whether to validate EDI types.
         * 
         * @return builder
         * 
         */
        public Builder validateEDITypes(Boolean validateEDITypes) {
            return validateEDITypes(Output.of(validateEDITypes));
        }

        /**
         * @param validateXSDTypes The value indicating whether to validate XSD types.
         * 
         * @return builder
         * 
         */
        public Builder validateXSDTypes(Output<Boolean> validateXSDTypes) {
            $.validateXSDTypes = validateXSDTypes;
            return this;
        }

        /**
         * @param validateXSDTypes The value indicating whether to validate XSD types.
         * 
         * @return builder
         * 
         */
        public Builder validateXSDTypes(Boolean validateXSDTypes) {
            return validateXSDTypes(Output.of(validateXSDTypes));
        }

        public EdifactValidationOverrideArgs build() {
            $.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull($.allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
            $.enforceCharacterSet = Objects.requireNonNull($.enforceCharacterSet, "expected parameter 'enforceCharacterSet' to be non-null");
            $.messageId = Objects.requireNonNull($.messageId, "expected parameter 'messageId' to be non-null");
            $.trailingSeparatorPolicy = Objects.requireNonNull($.trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
            $.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull($.trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
            $.validateEDITypes = Objects.requireNonNull($.validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
            $.validateXSDTypes = Objects.requireNonNull($.validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
            return $;
        }
    }

}
