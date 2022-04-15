// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsoleWithLocationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConsoleWithLocationArgs Empty = new GetConsoleWithLocationArgs();

    /**
     * The name of the console
     * 
     */
    @Import(name="consoleName", required=true)
      private final String consoleName;

    public String consoleName() {
        return this.consoleName;
    }

    /**
     * The provider location
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    public GetConsoleWithLocationArgs(
        String consoleName,
        String location) {
        this.consoleName = Objects.requireNonNull(consoleName, "expected parameter 'consoleName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private GetConsoleWithLocationArgs() {
        this.consoleName = null;
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsoleWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consoleName;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsoleWithLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleName = defaults.consoleName;
    	      this.location = defaults.location;
        }

        public Builder consoleName(String consoleName) {
            this.consoleName = Objects.requireNonNull(consoleName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public GetConsoleWithLocationArgs build() {
            return new GetConsoleWithLocationArgs(consoleName, location);
        }
    }
}
