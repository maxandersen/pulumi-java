// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class SecretRotationRotationRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretRotationRotationRulesArgs Empty = new SecretRotationRotationRulesArgs();

    /**
     * Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    @Import(name="automaticallyAfterDays", required=true)
    private Output<Integer> automaticallyAfterDays;

    public Output<Integer> automaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    private SecretRotationRotationRulesArgs() {}

    private SecretRotationRotationRulesArgs(SecretRotationRotationRulesArgs $) {
        this.automaticallyAfterDays = $.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretRotationRotationRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretRotationRotationRulesArgs $;

        public Builder() {
            $ = new SecretRotationRotationRulesArgs();
        }

        public Builder(SecretRotationRotationRulesArgs defaults) {
            $ = new SecretRotationRotationRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder automaticallyAfterDays(Output<Integer> automaticallyAfterDays) {
            $.automaticallyAfterDays = automaticallyAfterDays;
            return this;
        }

        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            return automaticallyAfterDays(Output.of(automaticallyAfterDays));
        }

        public SecretRotationRotationRulesArgs build() {
            $.automaticallyAfterDays = Objects.requireNonNull($.automaticallyAfterDays, "expected parameter 'automaticallyAfterDays' to be non-null");
            return $;
        }
    }

}
