// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class Capabilities {
    /**
     * Added capabilities
     * 
     */
    private final @Nullable List<String> add;
    /**
     * Removed capabilities
     * 
     */
    private final @Nullable List<String> drop;

    @OutputCustomType.Constructor
    private Capabilities(
        @OutputCustomType.Parameter("add") @Nullable List<String> add,
        @OutputCustomType.Parameter("drop") @Nullable List<String> drop) {
        this.add = add;
        this.drop = drop;
    }

    /**
     * Added capabilities
     * 
    */
    public List<String> getAdd() {
        return this.add == null ? List.of() : this.add;
    }
    /**
     * Removed capabilities
     * 
    */
    public List<String> getDrop() {
        return this.drop == null ? List.of() : this.drop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Capabilities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> add;
        private @Nullable List<String> drop;

        public Builder() {
    	      // Empty
        }

        public Builder(Capabilities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.drop = defaults.drop;
        }

        public Builder setAdd(@Nullable List<String> add) {
            this.add = add;
            return this;
        }

        public Builder setDrop(@Nullable List<String> drop) {
            this.drop = drop;
            return this;
        }
        public Capabilities build() {
            return new Capabilities(add, drop);
        }
    }
}
