// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a user that is recommended to be allowed for a certain rule
 * 
 */
public final class UserRecommendationArgs extends ResourceArgs {

    public static final UserRecommendationArgs Empty = new UserRecommendationArgs();

    /**
     * The recommendation action of the machine or rule
     * 
     */
    @Import(name="recommendationAction")
    private @Nullable Output<String> recommendationAction;

    /**
     * @return The recommendation action of the machine or rule
     * 
     */
    public Optional<Output<String>> recommendationAction() {
        return Optional.ofNullable(this.recommendationAction);
    }

    /**
     * Represents a user that is recommended to be allowed for a certain rule
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Represents a user that is recommended to be allowed for a certain rule
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private UserRecommendationArgs() {}

    private UserRecommendationArgs(UserRecommendationArgs $) {
        this.recommendationAction = $.recommendationAction;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRecommendationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRecommendationArgs $;

        public Builder() {
            $ = new UserRecommendationArgs();
        }

        public Builder(UserRecommendationArgs defaults) {
            $ = new UserRecommendationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recommendationAction The recommendation action of the machine or rule
         * 
         * @return builder
         * 
         */
        public Builder recommendationAction(@Nullable Output<String> recommendationAction) {
            $.recommendationAction = recommendationAction;
            return this;
        }

        /**
         * @param recommendationAction The recommendation action of the machine or rule
         * 
         * @return builder
         * 
         */
        public Builder recommendationAction(String recommendationAction) {
            return recommendationAction(Output.of(recommendationAction));
        }

        /**
         * @param username Represents a user that is recommended to be allowed for a certain rule
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Represents a user that is recommended to be allowed for a certain rule
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public UserRecommendationArgs build() {
            return $;
        }
    }

}
