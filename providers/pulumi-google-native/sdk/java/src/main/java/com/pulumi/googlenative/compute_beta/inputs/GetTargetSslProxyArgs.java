// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetSslProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetSslProxyArgs Empty = new GetTargetSslProxyArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="targetSslProxy", required=true)
      private final String targetSslProxy;

    public String targetSslProxy() {
        return this.targetSslProxy;
    }

    public GetTargetSslProxyArgs(
        @Nullable String project,
        String targetSslProxy) {
        this.project = project;
        this.targetSslProxy = Objects.requireNonNull(targetSslProxy, "expected parameter 'targetSslProxy' to be non-null");
    }

    private GetTargetSslProxyArgs() {
        this.project = null;
        this.targetSslProxy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetSslProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String targetSslProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetSslProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.targetSslProxy = defaults.targetSslProxy;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder targetSslProxy(String targetSslProxy) {
            this.targetSslProxy = Objects.requireNonNull(targetSslProxy);
            return this;
        }        public GetTargetSslProxyArgs build() {
            return new GetTargetSslProxyArgs(project, targetSslProxy);
        }
    }
}
