// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterParameterGroupParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupParameterArgs Empty = new ClusterParameterGroupParameterArgs();

    /**
     * &#34;immediate&#34; (default), or &#34;pending-reboot&#34;. Some
     * engines can&#39;t apply some parameters without a reboot, and you will need to
     * specify &#34;pending-reboot&#34; here.
     * 
     */
    @Import(name="applyMethod")
    private @Nullable Output<String> applyMethod;

    public Optional<Output<String>> applyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }

    /**
     * The name of the DB parameter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the DB parameter.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ClusterParameterGroupParameterArgs() {}

    private ClusterParameterGroupParameterArgs(ClusterParameterGroupParameterArgs $) {
        this.applyMethod = $.applyMethod;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterParameterGroupParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterParameterGroupParameterArgs $;

        public Builder() {
            $ = new ClusterParameterGroupParameterArgs();
        }

        public Builder(ClusterParameterGroupParameterArgs defaults) {
            $ = new ClusterParameterGroupParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyMethod(@Nullable Output<String> applyMethod) {
            $.applyMethod = applyMethod;
            return this;
        }

        public Builder applyMethod(String applyMethod) {
            return applyMethod(Output.of(applyMethod));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterParameterGroupParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
