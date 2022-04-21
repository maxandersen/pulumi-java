// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateValidationState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateValidationState Empty = new CertificateValidationState();

    /**
     * The ARN of the certificate that is being validated.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
     * 
     */
    @Import(name="validationRecordFqdns")
    private @Nullable Output<List<String>> validationRecordFqdns;

    public Optional<Output<List<String>>> validationRecordFqdns() {
        return Optional.ofNullable(this.validationRecordFqdns);
    }

    private CertificateValidationState() {}

    private CertificateValidationState(CertificateValidationState $) {
        this.certificateArn = $.certificateArn;
        this.validationRecordFqdns = $.validationRecordFqdns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateValidationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateValidationState $;

        public Builder() {
            $ = new CertificateValidationState();
        }

        public Builder(CertificateValidationState defaults) {
            $ = new CertificateValidationState(Objects.requireNonNull(defaults));
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder validationRecordFqdns(@Nullable Output<List<String>> validationRecordFqdns) {
            $.validationRecordFqdns = validationRecordFqdns;
            return this;
        }

        public Builder validationRecordFqdns(List<String> validationRecordFqdns) {
            return validationRecordFqdns(Output.of(validationRecordFqdns));
        }

        public Builder validationRecordFqdns(String... validationRecordFqdns) {
            return validationRecordFqdns(List.of(validationRecordFqdns));
        }

        public CertificateValidationState build() {
            return $;
        }
    }

}
