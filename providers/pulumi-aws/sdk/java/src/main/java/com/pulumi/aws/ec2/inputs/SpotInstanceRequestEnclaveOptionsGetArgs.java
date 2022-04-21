// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotInstanceRequestEnclaveOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestEnclaveOptionsGetArgs Empty = new SpotInstanceRequestEnclaveOptionsGetArgs();

    /**
     * Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private SpotInstanceRequestEnclaveOptionsGetArgs() {}

    private SpotInstanceRequestEnclaveOptionsGetArgs(SpotInstanceRequestEnclaveOptionsGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotInstanceRequestEnclaveOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotInstanceRequestEnclaveOptionsGetArgs $;

        public Builder() {
            $ = new SpotInstanceRequestEnclaveOptionsGetArgs();
        }

        public Builder(SpotInstanceRequestEnclaveOptionsGetArgs defaults) {
            $ = new SpotInstanceRequestEnclaveOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SpotInstanceRequestEnclaveOptionsGetArgs build() {
            return $;
        }
    }

}
