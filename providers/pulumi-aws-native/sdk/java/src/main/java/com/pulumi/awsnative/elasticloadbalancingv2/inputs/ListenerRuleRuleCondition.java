// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHostHeaderConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpHeaderConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpRequestMethodConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRulePathPatternConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleQueryStringConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleSourceIpConfig;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleRuleCondition extends com.pulumi.resources.InvokeArgs {

    public static final ListenerRuleRuleCondition Empty = new ListenerRuleRuleCondition();

    @Import(name="field")
      private final @Nullable String field;

    public Optional<String> field() {
        return this.field == null ? Optional.empty() : Optional.ofNullable(this.field);
    }

    @Import(name="hostHeaderConfig")
      private final @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig;

    public Optional<ListenerRuleHostHeaderConfig> hostHeaderConfig() {
        return this.hostHeaderConfig == null ? Optional.empty() : Optional.ofNullable(this.hostHeaderConfig);
    }

    @Import(name="httpHeaderConfig")
      private final @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig;

    public Optional<ListenerRuleHttpHeaderConfig> httpHeaderConfig() {
        return this.httpHeaderConfig == null ? Optional.empty() : Optional.ofNullable(this.httpHeaderConfig);
    }

    @Import(name="httpRequestMethodConfig")
      private final @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig;

    public Optional<ListenerRuleHttpRequestMethodConfig> httpRequestMethodConfig() {
        return this.httpRequestMethodConfig == null ? Optional.empty() : Optional.ofNullable(this.httpRequestMethodConfig);
    }

    @Import(name="pathPatternConfig")
      private final @Nullable ListenerRulePathPatternConfig pathPatternConfig;

    public Optional<ListenerRulePathPatternConfig> pathPatternConfig() {
        return this.pathPatternConfig == null ? Optional.empty() : Optional.ofNullable(this.pathPatternConfig);
    }

    @Import(name="queryStringConfig")
      private final @Nullable ListenerRuleQueryStringConfig queryStringConfig;

    public Optional<ListenerRuleQueryStringConfig> queryStringConfig() {
        return this.queryStringConfig == null ? Optional.empty() : Optional.ofNullable(this.queryStringConfig);
    }

    @Import(name="sourceIpConfig")
      private final @Nullable ListenerRuleSourceIpConfig sourceIpConfig;

    public Optional<ListenerRuleSourceIpConfig> sourceIpConfig() {
        return this.sourceIpConfig == null ? Optional.empty() : Optional.ofNullable(this.sourceIpConfig);
    }

    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public ListenerRuleRuleCondition(
        @Nullable String field,
        @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig,
        @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig,
        @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig,
        @Nullable ListenerRulePathPatternConfig pathPatternConfig,
        @Nullable ListenerRuleQueryStringConfig queryStringConfig,
        @Nullable ListenerRuleSourceIpConfig sourceIpConfig,
        @Nullable List<String> values) {
        this.field = field;
        this.hostHeaderConfig = hostHeaderConfig;
        this.httpHeaderConfig = httpHeaderConfig;
        this.httpRequestMethodConfig = httpRequestMethodConfig;
        this.pathPatternConfig = pathPatternConfig;
        this.queryStringConfig = queryStringConfig;
        this.sourceIpConfig = sourceIpConfig;
        this.values = values;
    }

    private ListenerRuleRuleCondition() {
        this.field = null;
        this.hostHeaderConfig = null;
        this.httpHeaderConfig = null;
        this.httpRequestMethodConfig = null;
        this.pathPatternConfig = null;
        this.queryStringConfig = null;
        this.sourceIpConfig = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String field;
        private @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig;
        private @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig;
        private @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig;
        private @Nullable ListenerRulePathPatternConfig pathPatternConfig;
        private @Nullable ListenerRuleQueryStringConfig queryStringConfig;
        private @Nullable ListenerRuleSourceIpConfig sourceIpConfig;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.hostHeaderConfig = defaults.hostHeaderConfig;
    	      this.httpHeaderConfig = defaults.httpHeaderConfig;
    	      this.httpRequestMethodConfig = defaults.httpRequestMethodConfig;
    	      this.pathPatternConfig = defaults.pathPatternConfig;
    	      this.queryStringConfig = defaults.queryStringConfig;
    	      this.sourceIpConfig = defaults.sourceIpConfig;
    	      this.values = defaults.values;
        }

        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }
        public Builder hostHeaderConfig(@Nullable ListenerRuleHostHeaderConfig hostHeaderConfig) {
            this.hostHeaderConfig = hostHeaderConfig;
            return this;
        }
        public Builder httpHeaderConfig(@Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig) {
            this.httpHeaderConfig = httpHeaderConfig;
            return this;
        }
        public Builder httpRequestMethodConfig(@Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig) {
            this.httpRequestMethodConfig = httpRequestMethodConfig;
            return this;
        }
        public Builder pathPatternConfig(@Nullable ListenerRulePathPatternConfig pathPatternConfig) {
            this.pathPatternConfig = pathPatternConfig;
            return this;
        }
        public Builder queryStringConfig(@Nullable ListenerRuleQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public Builder sourceIpConfig(@Nullable ListenerRuleSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ListenerRuleRuleCondition build() {
            return new ListenerRuleRuleCondition(field, hostHeaderConfig, httpHeaderConfig, httpRequestMethodConfig, pathPatternConfig, queryStringConfig, sourceIpConfig, values);
        }
    }
}
