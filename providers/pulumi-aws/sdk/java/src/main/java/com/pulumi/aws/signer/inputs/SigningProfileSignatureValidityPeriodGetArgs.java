// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SigningProfileSignatureValidityPeriodGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningProfileSignatureValidityPeriodGetArgs Empty = new SigningProfileSignatureValidityPeriodGetArgs();

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="value", required=true)
    private Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    private SigningProfileSignatureValidityPeriodGetArgs() {}

    private SigningProfileSignatureValidityPeriodGetArgs(SigningProfileSignatureValidityPeriodGetArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningProfileSignatureValidityPeriodGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningProfileSignatureValidityPeriodGetArgs $;

        public Builder() {
            $ = new SigningProfileSignatureValidityPeriodGetArgs();
        }

        public Builder(SigningProfileSignatureValidityPeriodGetArgs defaults) {
            $ = new SigningProfileSignatureValidityPeriodGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public SigningProfileSignatureValidityPeriodGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
