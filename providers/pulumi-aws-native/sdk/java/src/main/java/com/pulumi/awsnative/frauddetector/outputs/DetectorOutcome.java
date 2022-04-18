// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.outputs;

import com.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorOutcome {
    private final @Nullable String arn;
    /**
     * The time when the outcome was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    private final @Nullable Boolean inline;
    /**
     * The time when the outcome was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable String name;
    /**
     * Tags associated with this outcome.
     * 
     */
    private final @Nullable List<DetectorTag> tags;

    @CustomType.Constructor
    private DetectorOutcome(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("inline") @Nullable Boolean inline,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The time when the outcome was created.
     * 
    */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> inline() {
        return Optional.ofNullable(this.inline);
    }
    /**
     * The time when the outcome was last updated.
     * 
    */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tags associated with this outcome.
     * 
    */
    public List<DetectorTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorOutcome defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable Boolean inline;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorOutcome defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder inline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DetectorTag... tags) {
            return tags(List.of(tags));
        }        public DetectorOutcome build() {
            return new DetectorOutcome(arn, createdTime, description, inline, lastUpdatedTime, name, tags);
        }
    }
}
