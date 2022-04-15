// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.random.RandomStringArgs;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.RandomStringState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The resource `random.RandomString` generates a random permutation of alphanumeric characters and optionally special characters.
 * 
 * This resource *does* use a cryptographic random number generator.
 * 
 * Historically this resource's intended usage has been ambiguous as the original example used it in a password. For backwards compatibility it will continue to exist. For unique ids please use random_id, for sensitive random values please use random_password.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * # Strings can be imported by just specifying the value of the string
 * 
 * ```sh
 *  $ pulumi import random:index/randomString:RandomString test test
 * ```
 * 
 */
@ResourceType(type="random:index/randomString:RandomString")
public class RandomString extends io.pulumi.resources.CustomResource {
    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @Export(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> keepers() {
        return this.keepers;
    }
    /**
     * The length of the string desired.
     * 
     */
    @Export(name="length", type=Integer.class, parameters={})
    private Output<Integer> length;

    /**
     * @return The length of the string desired.
     * 
     */
    public Output<Integer> length() {
        return this.length;
    }
    /**
     * Include lowercase alphabet characters in the result.
     * 
     */
    @Export(name="lower", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> lower;

    /**
     * @return Include lowercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> lower() {
        return this.lower;
    }
    /**
     * Minimum number of lowercase alphabet characters in the result.
     * 
     */
    @Export(name="minLower", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minLower;

    /**
     * @return Minimum number of lowercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> minLower() {
        return this.minLower;
    }
    /**
     * Minimum number of numeric characters in the result.
     * 
     */
    @Export(name="minNumeric", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minNumeric;

    /**
     * @return Minimum number of numeric characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> minNumeric() {
        return this.minNumeric;
    }
    /**
     * Minimum number of special characters in the result.
     * 
     */
    @Export(name="minSpecial", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSpecial;

    /**
     * @return Minimum number of special characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> minSpecial() {
        return this.minSpecial;
    }
    /**
     * Minimum number of uppercase alphabet characters in the result.
     * 
     */
    @Export(name="minUpper", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minUpper;

    /**
     * @return Minimum number of uppercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> minUpper() {
        return this.minUpper;
    }
    /**
     * Include numeric characters in the result.
     * 
     */
    @Export(name="number", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> number;

    /**
     * @return Include numeric characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> number() {
        return this.number;
    }
    /**
     * Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    @Export(name="overrideSpecial", type=String.class, parameters={})
    private Output</* @Nullable */ String> overrideSpecial;

    /**
     * @return Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    public Output</* @Nullable */ String> overrideSpecial() {
        return this.overrideSpecial;
    }
    /**
     * The generated random string.
     * 
     */
    @Export(name="result", type=String.class, parameters={})
    private Output<String> result;

    /**
     * @return The generated random string.
     * 
     */
    public Output<String> result() {
        return this.result;
    }
    /**
     * Include special characters in the result. These are `!@#$%&*()-_=+[]{}<>:?`
     * 
     */
    @Export(name="special", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> special;

    /**
     * @return Include special characters in the result. These are `!@#$%&*()-_=+[]{}<>:?`
     * 
     */
    public Output</* @Nullable */ Boolean> special() {
        return this.special;
    }
    /**
     * Include uppercase alphabet characters in the result.
     * 
     */
    @Export(name="upper", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> upper;

    /**
     * @return Include uppercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> upper() {
        return this.upper;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RandomString(String name) {
        this(name, RandomStringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RandomString(String name, RandomStringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RandomString(String name, RandomStringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomString:RandomString", name, args == null ? RandomStringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RandomString(String name, Output<String> id, @Nullable RandomStringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomString:RandomString", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RandomString get(String name, Output<String> id, @Nullable RandomStringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomString(name, id, state, options);
    }
}
