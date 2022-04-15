// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EtwEventConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EtwEventConfigurationResponse Empty = new EtwEventConfigurationResponse();

    @Import(name="filter")
      private final @Nullable String filter;

    public Optional<String> filter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    @Import(name="id", required=true)
      private final Integer id;

    public Integer id() {
        return this.id;
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public EtwEventConfigurationResponse(
        @Nullable String filter,
        Integer id,
        String name) {
        this.filter = filter;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private EtwEventConfigurationResponse() {
        this.filter = null;
        this.id = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwEventConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private Integer id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwEventConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public EtwEventConfigurationResponse build() {
            return new EtwEventConfigurationResponse(filter, id, name);
        }
    }
}
