// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This activity verifies that an external resource exists.
 * 
 */
public final class ValidationActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ValidationActivityResponse Empty = new ValidationActivityResponse();

    /**
     * Can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="childItems")
      private final @Nullable Object childItems;

    public Optional<Object> childItems() {
        return this.childItems == null ? Optional.empty() : Optional.ofNullable(this.childItems);
    }

    /**
     * Validation activity dataset reference.
     * 
     */
    @Import(name="dataset", required=true)
      private final DatasetReferenceResponse dataset;

    public DatasetReferenceResponse dataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="minimumSize")
      private final @Nullable Object minimumSize;

    public Optional<Object> minimumSize() {
        return this.minimumSize == null ? Optional.empty() : Optional.ofNullable(this.minimumSize);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * A delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sleep")
      private final @Nullable Object sleep;

    public Optional<Object> sleep() {
        return this.sleep == null ? Optional.empty() : Optional.ofNullable(this.sleep);
    }

    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
      private final @Nullable Object timeout;

    public Optional<Object> timeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is 'Validation'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public ValidationActivityResponse(
        @Nullable Object childItems,
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object minimumSize,
        String name,
        @Nullable Object sleep,
        @Nullable Object timeout,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.childItems = childItems;
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.minimumSize = minimumSize;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sleep = sleep;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ValidationActivityResponse() {
        this.childItems = null;
        this.dataset = null;
        this.dependsOn = List.of();
        this.description = null;
        this.minimumSize = null;
        this.name = null;
        this.sleep = null;
        this.timeout = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object childItems;
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object minimumSize;
        private String name;
        private @Nullable Object sleep;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childItems = defaults.childItems;
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.minimumSize = defaults.minimumSize;
    	      this.name = defaults.name;
    	      this.sleep = defaults.sleep;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder childItems(@Nullable Object childItems) {
            this.childItems = childItems;
            return this;
        }
        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder minimumSize(@Nullable Object minimumSize) {
            this.minimumSize = minimumSize;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sleep(@Nullable Object sleep) {
            this.sleep = sleep;
            return this;
        }
        public Builder timeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public ValidationActivityResponse build() {
            return new ValidationActivityResponse(childItems, dataset, dependsOn, description, minimumSize, name, sleep, timeout, type, userProperties);
        }
    }
}
