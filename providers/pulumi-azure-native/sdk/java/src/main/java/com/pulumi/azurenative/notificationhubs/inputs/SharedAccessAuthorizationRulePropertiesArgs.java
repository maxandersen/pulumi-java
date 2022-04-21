// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.azurenative.notificationhubs.enums.AccessRights;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SharedAccessAuthorizationRule properties.
 * 
 */
public final class SharedAccessAuthorizationRulePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedAccessAuthorizationRulePropertiesArgs Empty = new SharedAccessAuthorizationRulePropertiesArgs();

    /**
     * The rights associated with the rule.
     * 
     */
    @Import(name="rights")
    private @Nullable Output<List<AccessRights>> rights;

    public Optional<Output<List<AccessRights>>> rights() {
        return Optional.ofNullable(this.rights);
    }

    private SharedAccessAuthorizationRulePropertiesArgs() {}

    private SharedAccessAuthorizationRulePropertiesArgs(SharedAccessAuthorizationRulePropertiesArgs $) {
        this.rights = $.rights;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedAccessAuthorizationRulePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedAccessAuthorizationRulePropertiesArgs $;

        public Builder() {
            $ = new SharedAccessAuthorizationRulePropertiesArgs();
        }

        public Builder(SharedAccessAuthorizationRulePropertiesArgs defaults) {
            $ = new SharedAccessAuthorizationRulePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder rights(@Nullable Output<List<AccessRights>> rights) {
            $.rights = rights;
            return this;
        }

        public Builder rights(List<AccessRights> rights) {
            return rights(Output.of(rights));
        }

        public Builder rights(AccessRights... rights) {
            return rights(List.of(rights));
        }

        public SharedAccessAuthorizationRulePropertiesArgs build() {
            return $;
        }
    }

}
