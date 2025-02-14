// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZonesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of zones available in the given region
     * 
     */
    private final List<String> names;
    private final String project;
    private final @Nullable String region;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetZonesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("status") @Nullable String status) {
        this.id = id;
        this.names = names;
        this.project = project;
        this.region = region;
        this.status = status;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of zones available in the given region
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public String project() {
        return this.project;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> names;
        private String project;
        private @Nullable String region;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetZonesResult build() {
            return new GetZonesResult(id, names, project, region, status);
        }
    }
}
