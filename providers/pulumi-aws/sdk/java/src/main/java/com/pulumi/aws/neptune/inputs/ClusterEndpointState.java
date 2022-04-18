// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointState Empty = new ClusterEndpointState();

    /**
     * The Neptune Cluster Endpoint Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    @Import(name="clusterEndpointIdentifier")
      private final @Nullable Output<String> clusterEndpointIdentifier;

    public Output<String> clusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier == null ? Codegen.empty() : this.clusterEndpointIdentifier;
    }

    /**
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * 
     */
    @Import(name="clusterIdentifier")
      private final @Nullable Output<String> clusterIdentifier;

    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier == null ? Codegen.empty() : this.clusterIdentifier;
    }

    /**
     * The DNS address of the endpoint.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    /**
     * The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
     * 
     */
    @Import(name="endpointType")
      private final @Nullable Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType == null ? Codegen.empty() : this.endpointType;
    }

    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * 
     */
    @Import(name="excludedMembers")
      private final @Nullable Output<List<String>> excludedMembers;

    public Output<List<String>> excludedMembers() {
        return this.excludedMembers == null ? Codegen.empty() : this.excludedMembers;
    }

    /**
     * List of DB instance identifiers that are part of the custom endpoint group.
     * 
     */
    @Import(name="staticMembers")
      private final @Nullable Output<List<String>> staticMembers;

    public Output<List<String>> staticMembers() {
        return this.staticMembers == null ? Codegen.empty() : this.staticMembers;
    }

    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ClusterEndpointState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterEndpointIdentifier,
        @Nullable Output<String> clusterIdentifier,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> endpointType,
        @Nullable Output<List<String>> excludedMembers,
        @Nullable Output<List<String>> staticMembers,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.clusterEndpointIdentifier = clusterEndpointIdentifier;
        this.clusterIdentifier = clusterIdentifier;
        this.endpoint = endpoint;
        this.endpointType = endpointType;
        this.excludedMembers = excludedMembers;
        this.staticMembers = staticMembers;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ClusterEndpointState() {
        this.arn = Codegen.empty();
        this.clusterEndpointIdentifier = Codegen.empty();
        this.clusterIdentifier = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.endpointType = Codegen.empty();
        this.excludedMembers = Codegen.empty();
        this.staticMembers = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterEndpointIdentifier;
        private @Nullable Output<String> clusterIdentifier;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> endpointType;
        private @Nullable Output<List<String>> excludedMembers;
        private @Nullable Output<List<String>> staticMembers;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterEndpointIdentifier = defaults.clusterEndpointIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointType = defaults.endpointType;
    	      this.excludedMembers = defaults.excludedMembers;
    	      this.staticMembers = defaults.staticMembers;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clusterEndpointIdentifier(@Nullable Output<String> clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = clusterEndpointIdentifier;
            return this;
        }
        public Builder clusterEndpointIdentifier(@Nullable String clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Codegen.ofNullable(clusterEndpointIdentifier);
            return this;
        }
        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }
        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Codegen.ofNullable(clusterIdentifier);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder endpointType(@Nullable Output<String> endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public Builder endpointType(@Nullable String endpointType) {
            this.endpointType = Codegen.ofNullable(endpointType);
            return this;
        }
        public Builder excludedMembers(@Nullable Output<List<String>> excludedMembers) {
            this.excludedMembers = excludedMembers;
            return this;
        }
        public Builder excludedMembers(@Nullable List<String> excludedMembers) {
            this.excludedMembers = Codegen.ofNullable(excludedMembers);
            return this;
        }
        public Builder excludedMembers(String... excludedMembers) {
            return excludedMembers(List.of(excludedMembers));
        }
        public Builder staticMembers(@Nullable Output<List<String>> staticMembers) {
            this.staticMembers = staticMembers;
            return this;
        }
        public Builder staticMembers(@Nullable List<String> staticMembers) {
            this.staticMembers = Codegen.ofNullable(staticMembers);
            return this;
        }
        public Builder staticMembers(String... staticMembers) {
            return staticMembers(List.of(staticMembers));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ClusterEndpointState build() {
            return new ClusterEndpointState(arn, clusterEndpointIdentifier, clusterIdentifier, endpoint, endpointType, excludedMembers, staticMembers, tags, tagsAll);
        }
    }
}
