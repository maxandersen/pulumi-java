// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.azurenative.datadog.inputs.DatadogHostMetadataResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatadogHostResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatadogHostResponse Empty = new DatadogHostResponse();

    /**
     * The aliases for the host.
     * 
     */
    @Import(name="aliases")
    private @Nullable List<String> aliases;

    public Optional<List<String>> aliases() {
        return Optional.ofNullable(this.aliases);
    }

    /**
     * The Datadog integrations reporting metrics for the host.
     * 
     */
    @Import(name="apps")
    private @Nullable List<String> apps;

    public Optional<List<String>> apps() {
        return Optional.ofNullable(this.apps);
    }

    @Import(name="meta")
    private @Nullable DatadogHostMetadataResponse meta;

    public Optional<DatadogHostMetadataResponse> meta() {
        return Optional.ofNullable(this.meta);
    }

    /**
     * The name of the host.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private DatadogHostResponse() {}

    private DatadogHostResponse(DatadogHostResponse $) {
        this.aliases = $.aliases;
        this.apps = $.apps;
        this.meta = $.meta;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatadogHostResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatadogHostResponse $;

        public Builder() {
            $ = new DatadogHostResponse();
        }

        public Builder(DatadogHostResponse defaults) {
            $ = new DatadogHostResponse(Objects.requireNonNull(defaults));
        }

        public Builder aliases(@Nullable List<String> aliases) {
            $.aliases = aliases;
            return this;
        }

        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }

        public Builder apps(@Nullable List<String> apps) {
            $.apps = apps;
            return this;
        }

        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }

        public Builder meta(@Nullable DatadogHostMetadataResponse meta) {
            $.meta = meta;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public DatadogHostResponse build() {
            return $;
        }
    }

}
