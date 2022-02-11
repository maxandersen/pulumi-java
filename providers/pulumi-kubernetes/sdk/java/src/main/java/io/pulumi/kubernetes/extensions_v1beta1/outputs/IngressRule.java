// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.HTTPIngressRuleValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressRule {
    private final @Nullable String host;
    private final @Nullable HTTPIngressRuleValue http;

    @OutputCustomType.Constructor({"host","http"})
    private IngressRule(
        @Nullable String host,
        @Nullable HTTPIngressRuleValue http) {
        this.host = host;
        this.http = http;
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<HTTPIngressRuleValue> getHttp() {
        return Optional.ofNullable(this.http);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable HTTPIngressRuleValue http;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setHttp(@Nullable HTTPIngressRuleValue http) {
            this.http = http;
            return this;
        }

        public IngressRule build() {
            return new IngressRule(host, http);
        }
    }
}
