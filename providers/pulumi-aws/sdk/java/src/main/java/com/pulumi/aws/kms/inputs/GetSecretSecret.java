// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretSecret extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretSecret Empty = new GetSecretSecret();

    @Import(name="context")
    private @Nullable Map<String,String> context;

    public Optional<Map<String,String>> context() {
        return Optional.ofNullable(this.context);
    }

    @Import(name="grantTokens")
    private @Nullable List<String> grantTokens;

    public Optional<List<String>> grantTokens() {
        return Optional.ofNullable(this.grantTokens);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="payload", required=true)
    private String payload;

    public String payload() {
        return this.payload;
    }

    private GetSecretSecret() {}

    private GetSecretSecret(GetSecretSecret $) {
        this.context = $.context;
        this.grantTokens = $.grantTokens;
        this.name = $.name;
        this.payload = $.payload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretSecret $;

        public Builder() {
            $ = new GetSecretSecret();
        }

        public Builder(GetSecretSecret defaults) {
            $ = new GetSecretSecret(Objects.requireNonNull(defaults));
        }

        public Builder context(@Nullable Map<String,String> context) {
            $.context = context;
            return this;
        }

        public Builder grantTokens(@Nullable List<String> grantTokens) {
            $.grantTokens = grantTokens;
            return this;
        }

        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder payload(String payload) {
            $.payload = payload;
            return this;
        }

        public GetSecretSecret build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.payload = Objects.requireNonNull($.payload, "expected parameter 'payload' to be non-null");
            return $;
        }
    }

}
