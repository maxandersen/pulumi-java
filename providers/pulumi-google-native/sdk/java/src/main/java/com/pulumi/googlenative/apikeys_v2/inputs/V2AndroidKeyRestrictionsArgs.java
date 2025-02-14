// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apikeys_v2.inputs.V2AndroidApplicationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Android apps that are allowed to use the key.
 * 
 */
public final class V2AndroidKeyRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2AndroidKeyRestrictionsArgs Empty = new V2AndroidKeyRestrictionsArgs();

    /**
     * A list of Android applications that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedApplications")
    private @Nullable Output<List<V2AndroidApplicationArgs>> allowedApplications;

    /**
     * @return A list of Android applications that are allowed to make API calls with this key.
     * 
     */
    public Optional<Output<List<V2AndroidApplicationArgs>>> allowedApplications() {
        return Optional.ofNullable(this.allowedApplications);
    }

    private V2AndroidKeyRestrictionsArgs() {}

    private V2AndroidKeyRestrictionsArgs(V2AndroidKeyRestrictionsArgs $) {
        this.allowedApplications = $.allowedApplications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2AndroidKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2AndroidKeyRestrictionsArgs $;

        public Builder() {
            $ = new V2AndroidKeyRestrictionsArgs();
        }

        public Builder(V2AndroidKeyRestrictionsArgs defaults) {
            $ = new V2AndroidKeyRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedApplications(@Nullable Output<List<V2AndroidApplicationArgs>> allowedApplications) {
            $.allowedApplications = allowedApplications;
            return this;
        }

        /**
         * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedApplications(List<V2AndroidApplicationArgs> allowedApplications) {
            return allowedApplications(Output.of(allowedApplications));
        }

        /**
         * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedApplications(V2AndroidApplicationArgs... allowedApplications) {
            return allowedApplications(List.of(allowedApplications));
        }

        public V2AndroidKeyRestrictionsArgs build() {
            return $;
        }
    }

}
