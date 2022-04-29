// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.enums.ServerVersion;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiPropertiesArgs extends ResourceArgs {

    public static final ApiPropertiesArgs Empty = new ApiPropertiesArgs();

    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
     */
    @Import(name="serverVersion")
    private @Nullable Output<Either<String,ServerVersion>> serverVersion;

    /**
     * @return Describes the ServerVersion of an a MongoDB account.
     * 
     */
    public Optional<Output<Either<String,ServerVersion>>> serverVersion() {
        return Optional.ofNullable(this.serverVersion);
    }

    private ApiPropertiesArgs() {}

    private ApiPropertiesArgs(ApiPropertiesArgs $) {
        this.serverVersion = $.serverVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiPropertiesArgs $;

        public Builder() {
            $ = new ApiPropertiesArgs();
        }

        public Builder(ApiPropertiesArgs defaults) {
            $ = new ApiPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverVersion Describes the ServerVersion of an a MongoDB account.
         * 
         * @return builder
         * 
         */
        public Builder serverVersion(@Nullable Output<Either<String,ServerVersion>> serverVersion) {
            $.serverVersion = serverVersion;
            return this;
        }

        /**
         * @param serverVersion Describes the ServerVersion of an a MongoDB account.
         * 
         * @return builder
         * 
         */
        public Builder serverVersion(Either<String,ServerVersion> serverVersion) {
            return serverVersion(Output.of(serverVersion));
        }

        /**
         * @param serverVersion Describes the ServerVersion of an a MongoDB account.
         * 
         * @return builder
         * 
         */
        public Builder serverVersion(String serverVersion) {
            return serverVersion(Either.ofLeft(serverVersion));
        }

        /**
         * @param serverVersion Describes the ServerVersion of an a MongoDB account.
         * 
         * @return builder
         * 
         */
        public Builder serverVersion(ServerVersion serverVersion) {
            return serverVersion(Either.ofRight(serverVersion));
        }

        public ApiPropertiesArgs build() {
            return $;
        }
    }

}
