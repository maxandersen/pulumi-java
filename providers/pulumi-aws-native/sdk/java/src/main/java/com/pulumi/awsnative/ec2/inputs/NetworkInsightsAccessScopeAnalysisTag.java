// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeAnalysisTag extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAccessScopeAnalysisTag Empty = new NetworkInsightsAccessScopeAnalysisTag();

    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public NetworkInsightsAccessScopeAnalysisTag(
        String key,
        @Nullable String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = value;
    }

    private NetworkInsightsAccessScopeAnalysisTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeAnalysisTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeAnalysisTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public NetworkInsightsAccessScopeAnalysisTag build() {
            return new NetworkInsightsAccessScopeAnalysisTag(key, value);
        }
    }
}
