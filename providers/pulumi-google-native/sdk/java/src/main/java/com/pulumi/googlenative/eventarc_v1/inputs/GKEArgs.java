// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a GKE destination.
 * 
 */
public final class GKEArgs extends com.pulumi.resources.ResourceArgs {

    public static final GKEArgs Empty = new GKEArgs();

    /**
     * The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created.
     * 
     */
    @Import(name="cluster", required=true)
      private final Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for example, us-central1) for regional clusters.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The namespace the GKE service is running in.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Name of the GKE service.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    public GKEArgs(
        Output<String> cluster,
        Output<String> location,
        Output<String> namespace,
        @Nullable Output<String> path,
        Output<String> service) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.path = path;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GKEArgs() {
        this.cluster = Codegen.empty();
        this.location = Codegen.empty();
        this.namespace = Codegen.empty();
        this.path = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GKEArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cluster;
        private Output<String> location;
        private Output<String> namespace;
        private @Nullable Output<String> path;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(GKEArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.location = defaults.location;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder cluster(Output<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public GKEArgs build() {
            return new GKEArgs(cluster, location, namespace, path, service);
        }
    }
}
