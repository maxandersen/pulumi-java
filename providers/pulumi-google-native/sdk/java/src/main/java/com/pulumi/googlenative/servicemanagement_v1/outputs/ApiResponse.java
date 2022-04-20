// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement_v1.outputs.MethodResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.MixinResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApiResponse {
    /**
     * The methods of this interface, in unspecified order.
     * 
     */
    private final List<MethodResponse> methods;
    /**
     * Included interfaces. See Mixin.
     * 
     */
    private final List<MixinResponse> mixins;
    /**
     * The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
     * 
     */
    private final String name;
    /**
     * Any metadata attached to the interface.
     * 
     */
    private final List<OptionResponse> options;
    /**
     * Source context for the protocol buffer service represented by this message.
     * 
     */
    private final SourceContextResponse sourceContext;
    /**
     * The source syntax of the service.
     * 
     */
    private final String syntax;
    /**
     * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ApiResponse(
        @CustomType.Parameter("methods") List<MethodResponse> methods,
        @CustomType.Parameter("mixins") List<MixinResponse> mixins,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") List<OptionResponse> options,
        @CustomType.Parameter("sourceContext") SourceContextResponse sourceContext,
        @CustomType.Parameter("syntax") String syntax,
        @CustomType.Parameter("version") String version) {
        this.methods = methods;
        this.mixins = mixins;
        this.name = name;
        this.options = options;
        this.sourceContext = sourceContext;
        this.syntax = syntax;
        this.version = version;
    }

    /**
     * The methods of this interface, in unspecified order.
     * 
    */
    public List<MethodResponse> methods() {
        return this.methods;
    }
    /**
     * Included interfaces. See Mixin.
     * 
    */
    public List<MixinResponse> mixins() {
        return this.mixins;
    }
    /**
     * The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Any metadata attached to the interface.
     * 
    */
    public List<OptionResponse> options() {
        return this.options;
    }
    /**
     * Source context for the protocol buffer service represented by this message.
     * 
    */
    public SourceContextResponse sourceContext() {
        return this.sourceContext;
    }
    /**
     * The source syntax of the service.
     * 
    */
    public String syntax() {
        return this.syntax;
    }
    /**
     * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MethodResponse> methods;
        private List<MixinResponse> mixins;
        private String name;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.mixins = defaults.mixins;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder methods(List<MethodResponse> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }
        public Builder methods(MethodResponse... methods) {
            return methods(List.of(methods));
        }
        public Builder mixins(List<MixinResponse> mixins) {
            this.mixins = Objects.requireNonNull(mixins);
            return this;
        }
        public Builder mixins(MixinResponse... mixins) {
            return mixins(List.of(mixins));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }
        public Builder sourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }
        public Builder syntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ApiResponse build() {
            return new ApiResponse(methods, mixins, name, options, sourceContext, syntax, version);
        }
    }
}
