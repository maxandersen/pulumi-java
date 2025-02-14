// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.SecurityPolicyDdosProtectionConfigDdosProtection;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyDdosProtectionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyDdosProtectionConfigArgs Empty = new SecurityPolicyDdosProtectionConfigArgs();

    @Import(name="ddosProtection")
    private @Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection;

    public Optional<Output<SecurityPolicyDdosProtectionConfigDdosProtection>> ddosProtection() {
        return Optional.ofNullable(this.ddosProtection);
    }

    private SecurityPolicyDdosProtectionConfigArgs() {}

    private SecurityPolicyDdosProtectionConfigArgs(SecurityPolicyDdosProtectionConfigArgs $) {
        this.ddosProtection = $.ddosProtection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyDdosProtectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyDdosProtectionConfigArgs $;

        public Builder() {
            $ = new SecurityPolicyDdosProtectionConfigArgs();
        }

        public Builder(SecurityPolicyDdosProtectionConfigArgs defaults) {
            $ = new SecurityPolicyDdosProtectionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder ddosProtection(@Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection) {
            $.ddosProtection = ddosProtection;
            return this;
        }

        public Builder ddosProtection(SecurityPolicyDdosProtectionConfigDdosProtection ddosProtection) {
            return ddosProtection(Output.of(ddosProtection));
        }

        public SecurityPolicyDdosProtectionConfigArgs build() {
            return $;
        }
    }

}
