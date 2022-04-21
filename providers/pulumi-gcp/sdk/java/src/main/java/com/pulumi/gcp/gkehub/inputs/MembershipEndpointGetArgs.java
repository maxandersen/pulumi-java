// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipEndpointGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointGetArgs Empty = new MembershipEndpointGetArgs();

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="gkeCluster")
    private @Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster;

    public Optional<Output<MembershipEndpointGkeClusterGetArgs>> gkeCluster() {
        return Optional.ofNullable(this.gkeCluster);
    }

    private MembershipEndpointGetArgs() {}

    private MembershipEndpointGetArgs(MembershipEndpointGetArgs $) {
        this.gkeCluster = $.gkeCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipEndpointGetArgs $;

        public Builder() {
            $ = new MembershipEndpointGetArgs();
        }

        public Builder(MembershipEndpointGetArgs defaults) {
            $ = new MembershipEndpointGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder gkeCluster(@Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster) {
            $.gkeCluster = gkeCluster;
            return this;
        }

        public Builder gkeCluster(MembershipEndpointGkeClusterGetArgs gkeCluster) {
            return gkeCluster(Output.of(gkeCluster));
        }

        public MembershipEndpointGetArgs build() {
            return $;
        }
    }

}
