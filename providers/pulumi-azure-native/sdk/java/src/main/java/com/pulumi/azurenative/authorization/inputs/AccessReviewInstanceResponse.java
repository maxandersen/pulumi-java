// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access Review Instance.
 * 
 */
public final class AccessReviewInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccessReviewInstanceResponse Empty = new AccessReviewInstanceResponse();

    /**
     * The DateTime when the review instance is scheduled to end.
     * 
     */
    @Import(name="endDateTime")
      private final @Nullable String endDateTime;

    public Optional<String> endDateTime() {
        return this.endDateTime == null ? Optional.empty() : Optional.ofNullable(this.endDateTime);
    }

    /**
     * The access review instance id.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The access review instance name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The DateTime when the review instance is scheduled to be start.
     * 
     */
    @Import(name="startDateTime")
      private final @Nullable String startDateTime;

    public Optional<String> startDateTime() {
        return this.startDateTime == null ? Optional.empty() : Optional.ofNullable(this.startDateTime);
    }

    /**
     * This read-only field specifies the status of an access review instance.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AccessReviewInstanceResponse(
        @Nullable String endDateTime,
        String id,
        String name,
        @Nullable String startDateTime,
        String status,
        String type) {
        this.endDateTime = endDateTime;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startDateTime = startDateTime;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccessReviewInstanceResponse() {
        this.endDateTime = null;
        this.id = null;
        this.name = null;
        this.startDateTime = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDateTime;
        private String id;
        private String name;
        private @Nullable String startDateTime;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDateTime = defaults.endDateTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startDateTime = defaults.startDateTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder endDateTime(@Nullable String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder startDateTime(@Nullable String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AccessReviewInstanceResponse build() {
            return new AccessReviewInstanceResponse(endDateTime, id, name, startDateTime, status, type);
        }
    }
}
