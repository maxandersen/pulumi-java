// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetHttpsProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetHttpsProxyArgs Empty = new GetTargetHttpsProxyArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="targetHttpsProxy", required=true)
      private final String targetHttpsProxy;

    public String targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    public GetTargetHttpsProxyArgs(
        @Nullable String project,
        String targetHttpsProxy) {
        this.project = project;
        this.targetHttpsProxy = Objects.requireNonNull(targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
    }

    private GetTargetHttpsProxyArgs() {
        this.project = null;
        this.targetHttpsProxy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String targetHttpsProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.targetHttpsProxy = defaults.targetHttpsProxy;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder targetHttpsProxy(String targetHttpsProxy) {
            this.targetHttpsProxy = Objects.requireNonNull(targetHttpsProxy);
            return this;
        }        public GetTargetHttpsProxyArgs build() {
            return new GetTargetHttpsProxyArgs(project, targetHttpsProxy);
        }
    }
}
