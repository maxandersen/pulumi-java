// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import java.util.List;
import java.util.Objects;


public final class AllowedConfigListArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllowedConfigListArgs Empty = new AllowedConfigListArgs();

    /**
     * All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be allowed for that field.
     * 
     */
    @Import(name="allowedConfigValues", required=true)
    private Output<List<ReusableConfigWrapperArgs>> allowedConfigValues;

    public Output<List<ReusableConfigWrapperArgs>> allowedConfigValues() {
        return this.allowedConfigValues;
    }

    private AllowedConfigListArgs() {}

    private AllowedConfigListArgs(AllowedConfigListArgs $) {
        this.allowedConfigValues = $.allowedConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedConfigListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedConfigListArgs $;

        public Builder() {
            $ = new AllowedConfigListArgs();
        }

        public Builder(AllowedConfigListArgs defaults) {
            $ = new AllowedConfigListArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedConfigValues(Output<List<ReusableConfigWrapperArgs>> allowedConfigValues) {
            $.allowedConfigValues = allowedConfigValues;
            return this;
        }

        public Builder allowedConfigValues(List<ReusableConfigWrapperArgs> allowedConfigValues) {
            return allowedConfigValues(Output.of(allowedConfigValues));
        }

        public Builder allowedConfigValues(ReusableConfigWrapperArgs... allowedConfigValues) {
            return allowedConfigValues(List.of(allowedConfigValues));
        }

        public AllowedConfigListArgs build() {
            $.allowedConfigValues = Objects.requireNonNull($.allowedConfigValues, "expected parameter 'allowedConfigValues' to be non-null");
            return $;
        }
    }

}
