// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities.
 * 
 */
public final class ServerAdministratorsArgs extends ResourceArgs {

    public static final ServerAdministratorsArgs Empty = new ServerAdministratorsArgs();

    /**
     * An array of administrator user identities.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return An array of administrator user identities.
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    private ServerAdministratorsArgs() {}

    private ServerAdministratorsArgs(ServerAdministratorsArgs $) {
        this.members = $.members;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerAdministratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerAdministratorsArgs $;

        public Builder() {
            $ = new ServerAdministratorsArgs();
        }

        public Builder(ServerAdministratorsArgs defaults) {
            $ = new ServerAdministratorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param members An array of administrator user identities.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members An array of administrator user identities.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members An array of administrator user identities.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        public ServerAdministratorsArgs build() {
            return $;
        }
    }

}
