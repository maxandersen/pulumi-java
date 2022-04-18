// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder.outputs;

import com.pulumi.awsnative.amplifyuibuilder.outputs.ComponentProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ComponentChild {
    private final @Nullable List<ComponentChild> children;
    private final String componentType;
    private final String name;
    private final ComponentProperties properties;

    @CustomType.Constructor
    private ComponentChild(
        @CustomType.Parameter("children") @Nullable List<ComponentChild> children,
        @CustomType.Parameter("componentType") String componentType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") ComponentProperties properties) {
        this.children = children;
        this.componentType = componentType;
        this.name = name;
        this.properties = properties;
    }

    public List<ComponentChild> children() {
        return this.children == null ? List.of() : this.children;
    }
    public String componentType() {
        return this.componentType;
    }
    public String name() {
        return this.name;
    }
    public ComponentProperties properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentChild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ComponentChild> children;
        private String componentType;
        private String name;
        private ComponentProperties properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentChild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.componentType = defaults.componentType;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder children(@Nullable List<ComponentChild> children) {
            this.children = children;
            return this;
        }
        public Builder children(ComponentChild... children) {
            return children(List.of(children));
        }
        public Builder componentType(String componentType) {
            this.componentType = Objects.requireNonNull(componentType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(ComponentProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public ComponentChild build() {
            return new ComponentChild(children, componentType, name, properties);
        }
    }
}
