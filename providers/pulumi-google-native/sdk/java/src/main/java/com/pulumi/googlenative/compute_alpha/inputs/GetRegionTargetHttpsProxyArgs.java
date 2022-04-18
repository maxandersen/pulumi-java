// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionTargetHttpsProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionTargetHttpsProxyArgs Empty = new GetRegionTargetHttpsProxyArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    @Import(name="targetHttpsProxy", required=true)
      private final String targetHttpsProxy;

    public String targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    public GetRegionTargetHttpsProxyArgs(
        @Nullable String project,
        String region,
        String targetHttpsProxy) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.targetHttpsProxy = Objects.requireNonNull(targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
    }

    private GetRegionTargetHttpsProxyArgs() {
        this.project = null;
        this.region = null;
        this.targetHttpsProxy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String targetHttpsProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionTargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.targetHttpsProxy = defaults.targetHttpsProxy;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder targetHttpsProxy(String targetHttpsProxy) {
            this.targetHttpsProxy = Objects.requireNonNull(targetHttpsProxy);
            return this;
        }        public GetRegionTargetHttpsProxyArgs build() {
            return new GetRegionTargetHttpsProxyArgs(project, region, targetHttpsProxy);
        }
    }
}
