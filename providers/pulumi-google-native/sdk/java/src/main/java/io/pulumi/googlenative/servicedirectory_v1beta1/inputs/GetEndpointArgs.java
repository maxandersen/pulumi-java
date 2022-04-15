// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEndpointArgs Empty = new GetEndpointArgs();

    @Import(name="endpointId", required=true)
      private final String endpointId;

    public String endpointId() {
        return this.endpointId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
      private final String namespaceId;

    public String namespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    public GetEndpointArgs(
        String endpointId,
        String location,
        String namespaceId,
        @Nullable String project,
        String serviceId) {
        this.endpointId = Objects.requireNonNull(endpointId, "expected parameter 'endpointId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetEndpointArgs() {
        this.endpointId = null;
        this.location = null;
        this.namespaceId = null;
        this.project = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointId;
        private String location;
        private String namespaceId;
        private @Nullable String project;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.location = defaults.location;
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }        public GetEndpointArgs build() {
            return new GetEndpointArgs(endpointId, location, namespaceId, project, serviceId);
        }
    }
}
