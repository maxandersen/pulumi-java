// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusVersionTargetGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusVersionTargetGetArgs Empty = new RegionInstanceGroupManagerStatusVersionTargetGetArgs();

    @Import(name="isReached")
    private @Nullable Output<Boolean> isReached;

    public Optional<Output<Boolean>> isReached() {
        return Optional.ofNullable(this.isReached);
    }

    private RegionInstanceGroupManagerStatusVersionTargetGetArgs() {}

    private RegionInstanceGroupManagerStatusVersionTargetGetArgs(RegionInstanceGroupManagerStatusVersionTargetGetArgs $) {
        this.isReached = $.isReached;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerStatusVersionTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerStatusVersionTargetGetArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerStatusVersionTargetGetArgs();
        }

        public Builder(RegionInstanceGroupManagerStatusVersionTargetGetArgs defaults) {
            $ = new RegionInstanceGroupManagerStatusVersionTargetGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder isReached(@Nullable Output<Boolean> isReached) {
            $.isReached = isReached;
            return this;
        }

        public Builder isReached(Boolean isReached) {
            return isReached(Output.of(isReached));
        }

        public RegionInstanceGroupManagerStatusVersionTargetGetArgs build() {
            return $;
        }
    }

}
