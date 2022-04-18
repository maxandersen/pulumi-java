// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentResponse {
    /**
     * Specifies whether the argument is input or output.
     * 
     */
    private final String mode;
    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    private final String name;
    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.mode = mode;
        this.name = name;
        this.type = type;
    }

    /**
     * Specifies whether the argument is input or output.
     * 
    */
    public String mode() {
        return this.mode;
    }
    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDatacatalogV1RoutineSpecArgumentResponse build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(mode, name, type);
        }
    }
}
